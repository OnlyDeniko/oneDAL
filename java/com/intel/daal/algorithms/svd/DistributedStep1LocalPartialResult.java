/* file: DistributedStep1LocalPartialResult.java */
/*******************************************************************************
* Copyright 2014-2021 Intel Corporation
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*     http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*******************************************************************************/

/**
 * @ingroup svd_distributed
 * @{
 */
package com.intel.daal.algorithms.svd;

import com.intel.daal.utils.*;
import com.intel.daal.services.DaalContext;

/**
 * <a name="DAAL-CLASS-ALGORITHMS__SVD__DISTRIBUTEDSTEP1LOCALPARTIALRESULT"></a>
 * @brief Provides methods to access partial results obtained with the compute() method of the SVD algorithm in the first step in the
 * distributed processing mode
 */
public class DistributedStep1LocalPartialResult extends OnlinePartialResult {
    /** @private */
    static {
        LibUtils.loadLibrary();
    }

    public DistributedStep1LocalPartialResult(DaalContext context, long cObject) {
        super(context, cObject);
    }
}
/** @} */
