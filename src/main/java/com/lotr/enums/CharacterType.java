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

package com.lotr.enums;

import com.lotr.interfaces.EnumAccessors;
import com.lotr.interfaces.LogStringVerbose;

public enum CharacterType implements EnumAccessors, LogStringVerbose {
    DWARF("1", "DWARF", "1 - Dwarf" ),
    ELF("2", "ELF", "2 - Elf" ),
    HOBBIT("3", "HOBBIT", "3 - Hobbit" ),
    MAN("4", "MAN", "4 - Man" ),
    WIZARD("5", "WIZARD", "5 - Wizard" ),
    ORC("6", "ORC", "6 - Orc" ),
    URUK_KAI("7", "URUK_KAI", "7 - Uruk Kai" ),
    TROLL("8", "TROLL", "8 - Troll" ),
    GOBLIN("9", "GOBLIN", "9 - Goblin" ),
    ;

    private final String id;
    private final String name;
    private final String description;

    CharacterType(final String id, final String name, final String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    /**
     * standard wrapper to retrieve the specific enum name
     */
    @Override
    public String getEnumName() {
        return this.name();
    }
    /**
     * standard wrapper to retrieve the specific fix action code for this enum. eg: the first field
     */
    @Override
    public String getID() {
        return id;
    }
    /**
     * standard wrapper to retrieve the specific fix name for this enum. eg: the second field
     */
    @Override
    public String getName() {
        return name;
    }
    /**
     * standard wrapper to retrieve the specific fix description for this enum. eg: the third field
     */
    @Override
    public String getDescription() {
        return description;
    }
    /**
     * standard wrapper to format a detailed string describing this enum
     */
    @Override
    public String toLogStringVerbose() {
        return this.getClass().getSimpleName()
                .concat("\n\tEnumName[")
                .concat(getEnumName())
                .concat("]")
                .concat("\n\tAction[")
                .concat(getID())
                .concat("]")
                .concat("\n\tName[")
                .concat(getName())
                .concat("]")
                .concat("\n\tDescription[")
                .concat(getDescription())
                .concat("]");
    }
    /**
     * standard wrapper to format a simple string describing this enum
     */
    @Override
    public String toString() {
        return getEnumName()
                .concat("=[")
                .concat(getID())
                .concat(",")
                .concat(getName())
                .concat(",")
                .concat(getDescription())
                .concat("]");
    }

    /**
     *
     */
    public static void main(String[] args) {
        /*
         * dump all the enum values
         */
        for (CharacterType oneEnum : CharacterType.values()) {
            System.out.println(oneEnum);
        }
    }
}
