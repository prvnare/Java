package org.prvn.lab.data;

import java.util.Arrays;
import java.util.List;

public class PersonDatabase {
    private static List<Person> personList;

    static {

        Person person = new Person( "Thomas",  "Kelly",  23,  "Software",  "7700225VH",  "Indian",  "Male", 10000.0, Arrays.asList("Acroyoga","Diorama","Leather crafting","Makeup","Shoemaking"));
        Person person1 = new Person( "Scott",  "Boland",  31,  "Doctor",  "5452407DH",  "Israeli",  "Male", 120000.0, Arrays.asList("Lomography","Qigong","Soccer","Postcrossing","Airbrushing"));
        Person person2 = new Person( "Tom",  "Horan",  28,  "Artist",  "1241125LH",  "Mozambican",  "Male", 130000.0, Arrays.asList("Dog training","Darts","Rock painting","Astrology","Amateur radio"));
        Person person3 = new Person( "Nat",  "Thomson",  32,  "Sportsman",  "6993459TH",  "Quebecer",  "Male", 30000.0, Arrays.asList("Longboarding","Jumping rope","Flying disc","Anime","Animation"));
        Person person4 = new Person( "Billy",  "Murdoch",  22,  "Plumber",  "4115381JA",  "Finn",  "Male", 33000.0, Arrays.asList("Farming","Amateur geology","Auto detailing","radio","Anime"));
        Person person5 = new Person( "Shyamala",  "Navle",  25,  "Analyst",  "8268048MA",  "Bangladeshi",  "FeMale", 200000.0, Arrays.asList("Snorkeling","Audiophile","Iceboat racing","Astrology","Aquascaping"));
        Person person6 = new Person( "Rajan",  "Jamshedji",  26,  "Lawyer",  "4835734QA",  "Jamaican",  "Male", 300000.0, Arrays.asList("Acroyoga","Research","Long-distance running","Aquascaping","Astrology"));
        Person person7 = new Person( "Ajay",  "Hussain",  27,  "Teacher",  "9857460SH",  "Scot",  "Male", 3000.0, Arrays.asList("Shuffleboard","Herping=","Frisbee","Beatboxing","Baking"));
        Person person8 = new Person( "Vijay",  "Ali",  18,  "Scientist",  "7141506RA",  "Saudi",  "Male", 20000.0, Arrays.asList("Noodling","Aircraft spotting","Handball","Airbrushing","Beatboxing"));
        Person person9 = new Person( "Aditya",  "Nayudu",  19,  "Lecturer",  "0691084DH",  "Indian",  "FeMale", 90000.0, Arrays.asList("Herbalism","Bus spotting","Horsemanship","Photography","Blogging"));
        Person person10 = new Person( "Raju",  "Palia",  30,  "Driver",  "EC4744643",  "Kenyan",  "Male", 80000.0, Arrays.asList("Orienteering","Geocaching","Figure skating","Slot car","Bowling"));
        Person person11 = new Person( "Kundan",  "Hafeez",  20,  "Worker",  "5484880UA",  "Mexican",  "Male", 60000.0, Arrays.asList("Hobby horsing","Meteorology","Beach volleyball","Shoemaking","Bell ringing"));
        Person person12 = new Person( "Gary",  "Gilmour",  31,  "Software",  "EC4744643",  "Eritrean",  "FeMale", 57000.0, Arrays.asList("Fossicking","Trainspotting","Radio-controlled model playing","Postcrossing","Bullet journaling"));
        Person person13 = new Person( "Jeff",  "Hammond",  21,  "Doctor",  "E2875298K",  "Icelander",  "Male", 23000.0, Arrays.asList("Gymnastics","Gongoozling","Model United Nations","Conlanging","Construction"));
        Person person14 = new Person( "Jeff",  "Moss",  22,  "Pune",  "X050098",  "Uruguayan",  "Male", 56000.0, Arrays.asList("Karting","Jujitsu","Jukskei","Postcrossing","Shoemaking"));
        Person person15 = new Person( "Terry",  "Alderman",  33,  "Author",  "A4689996",  "Palestinian",  "Male", 89000.0, Arrays.asList("Tennis","Birdwatching","Beauty pageants","Reading","Conlanging"));
        Person person16 = new Person( "Martin",  "Kent",  34,  "Blogger",  "AA6474058",  "Malawian",  "FeMale", 13000.0, Arrays.asList("Dominoes","People-watching","Figure skating","Pyrography","Hula hooping"));
        Person person17 = new Person( "Tom",  "Jim",  30,  "Sociologist",  "A35811373",  "Salvadorans",  "Male", 30000.0, Arrays.asList("Hacking","Herp keeping","Philately","Gardening","Pet sitting"));
        Person person18 = new Person( "Jim",  "Gilmour",  29,  "SpeachWriter",  "E58728453",  "Punjabi",  "FeMale", 15000.0, Arrays.asList("Knowledge/word games","Diorama","Stuffed toy collecting","Hardware","Shoemaking"));
        Person person19 = new Person( "Jacob",  "Love",  27,  "Composer",  "E3905107K",  "Zambian",  "Male", 44400.0, Arrays.asList("Knife throwing","Seashell collecting","Ephemera collecting","Herp keeping","Postcrossing"));
        Person person20 = new Person( "Craig",  "Serjeant",  28,  "Dancer",  "E65078534",  "Libyan",  "FeMale", 34000.0, Arrays.asList("Mini Golf","Whale watching","Sea glass collecting[156]","Postcrossing","Shoemaking"));
        Person person21 = new Person( "Ian",  "Davis",  25,  "Pirate",  "C1732608",  "Malagas",  "FeMale", 45000.0, Arrays.asList("Cribbage","Insect collecting[152]","Fruit picking","Planning","Poetry"));
        Person person22 = new Person( "Max",  "Walker",  26,  "Televangelist",  "B9014623",  "Czechs",  "Male", 56000.0, Arrays.asList("Ticket collecting","Fossil hunting","Gold prospecting","Pole dancing","Philately"));
        Person person23 = new Person( "David",  "Renneberg",  23,  "Inventor",  "B9253391",  "Belgian",  "FeMale", 66000.0, Arrays.asList("Leaves","Mineral collecting","Zoo visiting","Inventing","Gunsmithing"));
        Person person24 = new Person( "Laurie",  "Nash",  27,  "Ethicist",  "C0625793",  "Sindhis",  "Male", 78000.0, Arrays.asList("Compact discs","Magnet fishing","Hobby horsing","Proverbs","Puppetry"));
        Person person25 = new Person( "William",  "Cooper",  38,  "Cosmologist",  "B9103971",  "Sotho",  "FeMale", 44000.0, Arrays.asList("Films","Stone collecting","Science and technology studies","Makeup","Shoemaking"));
        Person person26 = new Person( "Edwin",  "Evans",  29,  "Humorist",  "B9607270",  "Macedonians",  "Male", 23000.0, Arrays.asList("Minimalism","Magnet fishing","Memory training","Fashion","Slot car"));
        Person person27 = new Person( "Sammy",  "Jones",  28,  "Comedian",  "C1739097",  "Portuguese",  "FeMale", 45000.0, Arrays.asList("Journaling","Pilates","Photography","Makeup","VR Gaming"));
        Person person28 = new Person( "George",  "Giffen",  40,  "Censor",  "MB088095",  "Sudanese",  "Male", 78000.0, Arrays.asList("Pyrography","Tea bag collecting","Kendama","Orienteering","Shoemaking"));
        Person person29 = new Person( "Hammy",  "Love",  39,  "Musicologist",  "E1315229",  "Egyptian",  "FeMale", 33000.0, Arrays.asList("Kendama","Cue sports","Rapping","Word searches","Whittling"));
        Person person30 = new Person( "Bill",  "Brown",  33,  "Climber",  "A30930309",  "Cameroonians",  "Male", 300000.0, Arrays.asList("Zumba","Refinishing","Dining","Kung fu","Yoga"));
        Person person31 = new Person( "Arthur",  "Chipperfield",  35,  "Rheologist",  "A32888014",  "Ethiopians",  "FeMale", 10000.0, Arrays.asList("Frisbee","Horseshoes","Kendama","Orienteering","Tether car"));
        Person person32 = new Person( "Tup",  "Scott",  30,  "Sociologist",  "A35811373",  "Salvadorans",  "Male", 30000.0, Arrays.asList("Fitness","Orienteering","Water polo","Tennis polo racing","Race walking"));

        personList =  Arrays.asList(person, person1, person2, person3, person4, person5, person6, person7, person8, person9, person10,
                                    person11, person12, person13, person14, person15, person16, person17, person18, person19, person20,
                                    person21, person22,person23, person24, person25, person26, person27, person28, person29, person30,
                                    person31, person32);

    }

    public static List<Person> getPersonList() {
        return personList;
    }
}
