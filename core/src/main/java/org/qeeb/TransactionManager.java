/*
 *  Copyright 2019 QeeB Group.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package org.qeeb;

/**
 * Global transaction manager
 *
 * @author JamesZBL
 */
public interface TransactionManager {

    /**
     * Begin a transaction
     *
     * @param serviceId Id of service
     *
     * @return Id of the transaction
     */
    String begin(String serviceId);

    /**
     * Commit a transaction
     *
     * @param transactionId Id of transaction
     *
     * @return Status of transaction
     */
    TransactionStatus commit(String transactionId);

    /**
     * Rollback a transaction
     *
     * @param transactionId Id of transaction
     *
     * @return Status of transaction
     */
    TransactionStatus rollback(String transactionId);
}
