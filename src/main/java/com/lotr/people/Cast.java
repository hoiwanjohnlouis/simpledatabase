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

import com.lotr.enums.CharacterType;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// import java.io.FileOutputStream;
// import javax.json.Json;
// import javax.json.JsonArray;
// import javax.json.JsonWriter;
// import com.googlecode.json-simple;


public class Cast {
    List<OnePerson> _castOfCharacters;

    public Cast() {
        this._castOfCharacters = new ArrayList<>();
        System.out.println(".in Cast constructor");
    }

    public void loadCastOfLOTR () {
        System.out.println("..loadCastOfLOTR starts");
        _castOfCharacters.add(new OnePerson("Bilbo Baggins", "Bag End, Shire", CharacterType.HOBBIT));
        _castOfCharacters.add(new OnePerson("Frodo Baggins", "Bag End, Shire", CharacterType.HOBBIT));
        _castOfCharacters.add(new OnePerson("Meriadoc Brandybuck", "Brandywine, Shire", CharacterType.HOBBIT));
        _castOfCharacters.add(new OnePerson("Peregin Took", "Brandywine, Shire", CharacterType.HOBBIT));
        _castOfCharacters.add(new OnePerson("Legolas", "Northern Mirkwood", CharacterType.ELF));
        _castOfCharacters.add(new OnePerson("Elrond", "Rivendell", CharacterType.ELF));
        _castOfCharacters.add(new OnePerson("Galadriel", "Lothlorien", CharacterType.ELF));
        _castOfCharacters.add(new OnePerson("Gandalf", "Valinor", CharacterType.WIZARD));
        _castOfCharacters.add(new OnePerson("Saruman", "Orthanc", CharacterType.WIZARD));
        _castOfCharacters.add(new OnePerson("Sauron", "Mordor", CharacterType.WIZARD));
        _castOfCharacters.add(new OnePerson("Aragorn", "Eriador", CharacterType.MAN));
        _castOfCharacters.add(new OnePerson("Boromir", "Gondor", CharacterType.MAN));
        _castOfCharacters.add(new OnePerson("Faramir", "Gondor", CharacterType.MAN));
        _castOfCharacters.add(new OnePerson("Gimli", "Ered Luin", CharacterType.DWARF));
        _castOfCharacters.add(new OnePerson("Balin", "Moria", CharacterType.DWARF));
        _castOfCharacters.add(new OnePerson("Grishnak", "Orthanc", CharacterType.ORC));
        _castOfCharacters.add(new OnePerson("URUK-1", "Orthanc", CharacterType.URUK_KAI));
        _castOfCharacters.add(new OnePerson("GOBLIN-1", "Orthanc", CharacterType.GOBLIN));
        _castOfCharacters.add(new OnePerson("TROLL-1", "Under a Bridge", CharacterType.TROLL));
        System.out.println("..loadCastOfLOTR ends");
    }

    public void readCastFromJSONFile() {
        System.out.println("..readCastFromJSONFile starts");
        System.out.println("..readCastFromJSONFile ends");
    }

    public void writeCastToJSONFile() {
        System.out.println("..writeCastToJSONFile starts");

        for (OnePerson onePerson : Collections.unmodifiableList(_castOfCharacters)) {
            System.out.println("....onePerson" + onePerson);
        }

        System.out.println("..writeCastToJSONFile ends");
    }

    public void readCastFromTXTFile() {
        System.out.println("..readCastFromTXTFile starts");
        System.out.println("..readCastFromTXTFile ends");
    }

    public void writeCastToTXTFile() {
        System.out.println("..writeCastToTXTFile starts");
        try {
            FileWriter myWriter = new FileWriter(".\\filename.txt");
            for (OnePerson onePerson : Collections.unmodifiableList(_castOfCharacters)) {
                myWriter.write(onePerson.toString()+"\n");
                System.out.println("....Successfully wrote onePerson to the file. " + onePerson);
            }
            myWriter.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        System.out.println("..writeCastToTXTFile ends");
    }

    public void printCast() {
        System.out.println("..printCast starts");
        for (OnePerson onePerson : Collections.unmodifiableList(_castOfCharacters)) {
            System.out.println(onePerson);
        }
        System.out.println("..printCast ends");
    }

}
