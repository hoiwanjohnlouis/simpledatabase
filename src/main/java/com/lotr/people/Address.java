/*
 * Copyright (c) 2022.  HW Tech Services, LLC
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */

package com.lotr.people;

public class Address {

    private final String _residenceAddress;

    Address(String address) {
        _residenceAddress = address;
    }

    public String toString () {
        return "Address["
                .concat(_residenceAddress)
                .concat("]");
    }

    /**
     *
     */
    public static void main(String[] args) {
        Address address = new Address("16 Parkside Lane");
        System.out.println("Address is:" + address);
    }
}
