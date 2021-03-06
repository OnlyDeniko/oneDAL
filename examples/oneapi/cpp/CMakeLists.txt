#===============================================================================
# Copyright 2021 Intel Corporation
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#     http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.
#===============================================================================

cmake_minimum_required(VERSION 3.1)

project(oneapi_cpp_examples)

set(CMAKE_BUILD_TYPE Release)

set(USE_DPCPP no)
set(USE_NEW_IFACES yes)

function (add_examples examples)
    foreach(example ${examples})
        add_executable(${example} "${example}.cpp")
        target_include_directories(${example} PRIVATE ${oneDAL_INCLUDE_DIRS})
        if (UNIX)
            target_link_libraries(${example} PRIVATE -Wl,--start-group ${oneDAL_IMPORTED_TARGETS} -Wl,--end-group)
        else()
            target_link_libraries(${example} PRIVATE ${oneDAL_IMPORTED_TARGETS})
        endif()
        set_target_properties(${example} PROPERTIES RUNTIME_OUTPUT_DIRECTORY "${PROJECT_SOURCE_DIR}/_cmake_results/intel_intel64_${THREADING_TYPE}_${LINK_TYPE}")
    endforeach()
endfunction()

function (set_link_and_threading_types)
    if ("${TARGET_LINK}" STREQUAL "static")
        set(LINK_TYPE "a" PARENT_SCOPE)
    else()
        set(LINK_TYPE "so" PARENT_SCOPE)
    endif()

    if ("${USE_PARALLEL}" STREQUAL "yes")
        set(THREADING_TYPE "parallel" PARENT_SCOPE)
    else()
        set(THREADING_TYPE "sequential" PARENT_SCOPE)
    endif()
endfunction()

set_link_and_threading_types()

find_package(oneDAL REQUIRED)

include_directories(source)

add_subdirectory(source/pca)
