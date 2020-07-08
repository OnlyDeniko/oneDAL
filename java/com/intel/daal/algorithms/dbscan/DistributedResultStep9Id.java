/* file: DistributedResultStep9Id.java */
/*******************************************************************************
* Copyright 2014-2020 Intel Corporation
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
 * @ingroup dbscan_distributed
 * @{
 */
package com.intel.daal.algorithms.dbscan;

import com.intel.daal.utils.*;
/**
 * <a name="DAAL-CLASS-ALGORITHMS__DBSCAN__DISTRIBUTEDRESULTSTEP9ID"></a>
 * @brief Available identifiers of results of the DBSCAN training algorithm obtained
 * in the ninth step of the distributed processing mode
 */
public final class DistributedResultStep9Id {
    private int _value;

    static {
        LibUtils.loadLibrary();
    }

    /**
     * Constructs the result object identifier using the provided value
     * @param value     Value corresponding to the result object identifier
     */
    public DistributedResultStep9Id(int value) {
        _value = value;
    }

    /**
     * Returns the value corresponding to the result object identifier
     * @return Value corresponding to the result object identifier
     */
    public int getValue() {
        return _value;
    }

    private static final int step9NClustersValue = 0;

    public static final DistributedResultStep9Id step9NClusters = new DistributedResultStep9Id(step9NClustersValue);
        /*!< Table contianing the total number of clusters */
}
/** @} */