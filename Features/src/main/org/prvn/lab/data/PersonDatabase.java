package org.prvn.lab.data;

import java.util.Arrays;
import java.util.List;

public class PersonDatabase {
    private static List<Person> personList;

    static {

        Person person = new Person( "Thomas",  "Kelly",  23,  "Software",  "7700225VH",  "Indian",  "Male", 10000.0);
        Person person1 = new Person( "Scott",  "Boland",  31,  "Doctor",  "5452407DH",  "Israeli",  "Male", 120000.0);
        Person person2 = new Person( "Tom",  "Horan",  28,  "Artist",  "1241125LH",  "Mozambican",  "Male", 130000.0);
        Person person3 = new Person( "Nat",  "Thomson",  32,  "Sportsman",  "6993459TH",  "Quebecer",  "Male", 30000.0);
        Person person4 = new Person( "Billy",  "Murdoch",  22,  "Plumber",  "4115381JA",  "Finn",  "Male", 33000.0);
        Person person5 = new Person( "Shyamala",  "Navle",  25,  "Analyst",  "8268048MA",  "Bangladeshi",  "FeMale", 200000.0);
        Person person6 = new Person( "Rajan",  "Jamshedji",  26,  "Lawyer",  "4835734QA",  "Jamaican",  "Male", 300000.0);
        Person person7 = new Person( "Ajay",  "Hussain",  27,  "Teacher",  "9857460SH",  "Scot",  "Male", 3000.0);
        Person person8 = new Person( "Vijay",  "Ali",  18,  "Scientist",  "7141506RA",  "Saudi",  "Male", 20000.0);
        Person person9 = new Person( "Aditya",  "Nayudu",  19,  "Lecturer",  "0691084DH",  "Indian",  "FeMale", 90000.0);
        Person person10 = new Person( "Raju",  "Palia",  30,  "Driver",  "EC4744643",  "Kenyan",  "Male", 80000.0);
        Person person11 = new Person( "Kundan",  "Hafeez",  20,  "Worker",  "5484880UA",  "Mexican",  "Male", 60000.0);
        Person person12 = new Person( "Gary",  "Gilmour",  31,  "Software",  "EC4744643",  "Eritrean",  "FeMale", 57000.0);
        Person person13 = new Person( "Jeff",  "Hammond",  21,  "Doctor",  "E2875298K",  "Icelander",  "Male", 23000.0);
        Person person14 = new Person( "Jeff",  "Moss",  22,  "Pune",  "X050098",  "Uruguayan",  "Male", 56000.0);
        Person person15 = new Person( "Terry",  "Alderman",  33,  "Author",  "A4689996",  "Palestinian",  "Male", 89000.0);
        Person person16 = new Person( "Martin",  "Kent",  34,  "Blogger",  "AA6474058",  "Malawian",  "FeMale", 13000.0);
        Person person17 = new Person( "Rick",  "Darling",  24,  "Freelancer",  "E5322935J",  "Cajun",  "Male", 15000.0);
        Person person18 = new Person( "Jim",  "Gilmour",  29,  "SpeachWriter",  "E58728453",  "Punjabi",  "FeMale", 15000.0);
        Person person19 = new Person( "Jacob",  "Love",  27,  "Composer",  "E3905107K",  "Zambian",  "Male", 44400.0);
        Person person20 = new Person( "Craig",  "Serjeant",  28,  "Dancer",  "E65078534",  "Libyan",  "FeMale", 34000.0);
        Person person21 = new Person( "Ian",  "Davis",  25,  "Pirate",  "C1732608",  "Malagas",  "FeMale", 45000.0);
        Person person22 = new Person( "Max",  "Walker",  26,  "Televangelist",  "B9014623",  "Czechs",  "Male", 56000.0);
        Person person23 = new Person( "David",  "Renneberg",  23,  "Inventor",  "B9253391",  "Belgian",  "FeMale", 66000.0);
        Person person24 = new Person( "Laurie",  "Nash",  27,  "Ethicist",  "C0625793",  "Sindhis",  "Male", 78000.0);
        Person person25 = new Person( "William",  "Cooper",  38,  "Cosmologist",  "B9103971",  "Sotho",  "FeMale", 44000.0);
        Person person26 = new Person( "Edwin",  "Evans",  29,  "Humorist",  "B9607270",  "Macedonians",  "Male", 23000.0);
        Person person27 = new Person( "Sammy",  "Jones",  28,  "Comedian",  "C1739097",  "Portuguese",  "FeMale", 45000.0);
        Person person28 = new Person( "George",  "Giffen",  40,  "Censor",  "MB088095",  "Sudanese",  "Male", 78000.0);
        Person person29 = new Person( "Hammy",  "Love",  39,  "Musicologist",  "E1315229",  "Egyptian",  "FeMale", 33000.0);
        Person person30 = new Person( "Bill",  "Brown",  33,  "Climber",  "A30930309",  "Cameroonians",  "Male", 300000.0);
        Person person31 = new Person( "Arthur",  "Chipperfield",  35,  "Rheologist",  "A32888014",  "Ethiopians",  "FeMale", 10000.0);
        Person person32 = new Person( "Tup",  "Scott",  30,  "Sociologist",  "A35811373",  "Salvadorans",  "Male", 30000.0);

        personList =  Arrays.asList(person, person1, person2, person3, person4, person5, person6, person7, person8, person9, person10,
                                    person11, person12, person13, person14, person15, person16, person17, person18, person19, person20,
                                    person21, person22,person23, person24, person25, person26, person27, person28, person29, person30,
                                    person31, person32);

    }

    public static List<Person> getPersonList() {
        return personList;
    }
}
