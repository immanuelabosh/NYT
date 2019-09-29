package com.example.nyt; // <==== CHANGE ME

public class FakeAPI {
    // The sole purpose of this class is to provide you with a JSON string.
    // Think of it as simulating making a GET request to a server that returns you some data as JSON.

    public static String getMostViewedStoriesJsonString() {
        return "{\n" +
                "    \"status\": \"OK\",\n" +
                "    \"copyright\": \"Copyright (c) 2019 The New York Times Company.  All Rights Reserved.\",\n" +
                "    \"num_results\": 1336,\n" +
                "    \"results\": [\n" +
                "      {\n" +
                "        \"url\": \"https://www.nytimes.com/interactive/2019/10/16/us/politics/trump-letter-turkey.html\",\n" +
                "        \"adx_keywords\": \"Trump, Donald J;Turkey;Erdogan, Recep Tayyip\",\n" +
                "        \"column\": \"\",\n" +
                "        \"section\": \"U.S.\",\n" +
                "        \"byline\": \"By THE NEW YORK TIMES\",\n" +
                "        \"type\": \"Interactive\",\n" +
                "        \"title\": \"Read Trump’s Letter to President Erdogan of Turkey\",\n" +
                "        \"abstract\": \"Trump said he’d written the “very powerful” letter to warn the Turkish leader.\",\n" +
                "        \"published_date\": \"2019-10-16\",\n" +
                "        \"source\": \"The New York Times\",\n" +
                "        \"id\": 100000006772752,\n" +
                "        \"asset_id\": 100000006772752,\n" +
                "        \"views\": 1,\n" +
                "        \"des_facet\": \"\",\n" +
                "        \"org_facet\": \"\",\n" +
                "        \"per_facet\": [\n" +
                "          \"TRUMP, DONALD J\",\n" +
                "          \"ERDOGAN, RECEP TAYYIP\"\n" +
                "        ],\n" +
                "        \"geo_facet\": [\n" +
                "          \"TURKEY\"\n" +
                "        ],\n" +
                "        \"media\": [\n" +
                "          {\n" +
                "            \"type\": \"image\",\n" +
                "            \"subtype\": \"photo\",\n" +
                "            \"caption\": null,\n" +
                "            \"copyright\": null,\n" +
                "            \"approved_for_syndication\": 0,\n" +
                "            \"media-metadata\": [\n" +
                "              {\n" +
                "                \"url\": \"https://static01.nyt.com/images/2019/10/16/us/white-house-trump-letter-promo-1571261887115/white-house-trump-letter-promo-1571261887115-thumbStandard.jpg\",\n" +
                "                \"format\": \"Standard Thumbnail\",\n" +
                "                \"height\": 75,\n" +
                "                \"width\": 75\n" +
                "              },\n" +
                "              {\n" +
                "                \"url\": \"https://static01.nyt.com/images/2019/10/16/us/white-house-trump-letter-promo-1571261887115/white-house-trump-letter-promo-1571261887115-mediumThreeByTwo210.jpg\",\n" +
                "                \"format\": \"mediumThreeByTwo210\",\n" +
                "                \"height\": 140,\n" +
                "                \"width\": 210\n" +
                "              },\n" +
                "              {\n" +
                "                \"url\": \"https://static01.nyt.com/images/2019/10/16/us/white-house-trump-letter-promo-1571261887115/white-house-trump-letter-promo-1571261887115-mediumThreeByTwo440.jpg\",\n" +
                "                \"format\": \"mediumThreeByTwo440\",\n" +
                "                \"height\": 293,\n" +
                "                \"width\": 440\n" +
                "              }\n" +
                "            ]\n" +
                "          }\n" +
                "        ],\n" +
                "        \"uri\": \"nyt://interactive/f51c9656-2936-5ee5-b010-30ff48792578\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"url\": \"https://www.nytimes.com/2019/10/16/us/politics/democratic-debate.html\",\n" +
                "        \"adx_keywords\": \"Presidential Election of 2020;Debates (Political);Primaries and Caucuses;Biden, Joseph R Jr;Buttigieg, Pete (1982- );Harris, Kamala D;Warren, Elizabeth\",\n" +
                "        \"column\": null,\n" +
                "        \"section\": \"U.S.\",\n" +
                "        \"byline\": \"By SHANE GOLDMACHER and REID J. EPSTEIN\",\n" +
                "        \"type\": \"Article\",\n" +
                "        \"title\": \"6 Takeaways From the October Democratic Debate\",\n" +
                "        \"abstract\": \"Elizabeth Warren was called out by rivals for a change, Joe Biden failed to stand out and Bernie Sanders calmed concerns about his health. Pete Buttigieg had his biggest night yet.\",\n" +
                "        \"published_date\": \"2019-10-16\",\n" +
                "        \"source\": \"The New York Times\",\n" +
                "        \"id\": 100000006771168,\n" +
                "        \"asset_id\": 100000006771168,\n" +
                "        \"views\": 2,\n" +
                "        \"des_facet\": [\n" +
                "          \"PRESIDENTIAL ELECTION OF 2020\",\n" +
                "          \"DEBATES (POLITICAL)\"\n" +
                "        ],\n" +
                "        \"org_facet\": [\n" +
                "          \"PRIMARIES AND CAUCUSES\"\n" +
                "        ],\n" +
                "        \"per_facet\": [\n" +
                "          \"BIDEN, JOSEPH R JR\",\n" +
                "          \"BUTTIGIEG, PETE (1982- )\",\n" +
                "          \"HARRIS, KAMALA D\",\n" +
                "          \"WARREN, ELIZABETH\"\n" +
                "        ],\n" +
                "        \"geo_facet\": \"\",\n" +
                "        \"media\": [\n" +
                "          {\n" +
                "            \"type\": \"image\",\n" +
                "            \"subtype\": \"photo\",\n" +
                "            \"caption\": \"Senator Bernie Sanders and Joseph R. Biden Jr. after the debate on Tuesday.\",\n" +
                "            \"copyright\": \"Tamir Kalifa for The New York Times\",\n" +
                "            \"approved_for_syndication\": 1,\n" +
                "            \"media-metadata\": [\n" +
                "              {\n" +
                "                \"url\": \"https://static01.nyt.com/images/2019/11/15/us/politics/15debate-takeaways-promo/15debate-takeaways-promo-thumbStandard.jpg\",\n" +
                "                \"format\": \"Standard Thumbnail\",\n" +
                "                \"height\": 75,\n" +
                "                \"width\": 75\n" +
                "              },\n" +
                "              {\n" +
                "                \"url\": \"https://static01.nyt.com/images/2019/11/15/us/politics/15debate-takeaways-promo/15debate-takeaways-promo-mediumThreeByTwo210-v4.jpg\",\n" +
                "                \"format\": \"mediumThreeByTwo210\",\n" +
                "                \"height\": 140,\n" +
                "                \"width\": 210\n" +
                "              },\n" +
                "              {\n" +
                "                \"url\": \"https://static01.nyt.com/images/2019/11/15/us/politics/15debate-takeaways-promo/15debate-takeaways-promo-mediumThreeByTwo440-v4.jpg\",\n" +
                "                \"format\": \"mediumThreeByTwo440\",\n" +
                "                \"height\": 293,\n" +
                "                \"width\": 440\n" +
                "              }\n" +
                "            ]\n" +
                "          }\n" +
                "        ],\n" +
                "        \"uri\": \"nyt://article/9d66a804-e4fb-5907-927d-ef806e616e7c\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"url\": \"https://www.nytimes.com/2019/10/16/world/europe/donald-trump-harry-dunn-anne-sacoolas.html\",\n" +
                "        \"adx_keywords\": \"Sacoolas, Anne;Traffic Accidents and Safety;Deaths (Fatalities);Dunn, Harry (d 2019);Trump, Donald J;Diplomatic Immunity;Northamptonshire (England);Washington (DC);United States International Relations\",\n" +
                "        \"column\": null,\n" +
                "        \"section\": \"World\",\n" +
                "        \"byline\": \"By KATIE ROGERS and ILIANA MAGRA\",\n" +
                "        \"type\": \"Article\",\n" +
                "        \"title\": \"Trump Stuns Grieving Britons: Meet the Suspect in Your Son’s Death\",\n" +
                "        \"abstract\": \"At the White House, the parents of Harry Dunn were told that the woman they want to hold accountable for his death in a car crash was in an adjoining room.\",\n" +
                "        \"published_date\": \"2019-10-16\",\n" +
                "        \"source\": \"The New York Times\",\n" +
                "        \"id\": 100000006771386,\n" +
                "        \"asset_id\": 100000006771386,\n" +
                "        \"views\": 3,\n" +
                "        \"des_facet\": [\n" +
                "          \"TRAFFIC ACCIDENTS AND SAFETY\",\n" +
                "          \"UNITED STATES INTERNATIONAL RELATIONS\"\n" +
                "        ],\n" +
                "        \"org_facet\": [\n" +
                "          \"DEATHS (FATALITIES)\",\n" +
                "          \"DIPLOMATIC IMMUNITY\"\n" +
                "        ],\n" +
                "        \"per_facet\": [\n" +
                "          \"SACOOLAS, ANNE\",\n" +
                "          \"DUNN, HARRY (D 2019)\",\n" +
                "          \"TRUMP, DONALD J\"\n" +
                "        ],\n" +
                "        \"geo_facet\": [\n" +
                "          \"NORTHAMPTONSHIRE (ENGLAND)\",\n" +
                "          \"WASHINGTON (DC)\"\n" +
                "        ],\n" +
                "        \"media\": [\n" +
                "          {\n" +
                "            \"type\": \"image\",\n" +
                "            \"subtype\": \"photo\",\n" +
                "            \"caption\": \"Charlotte Charles, the mother of Harry Dunn, with her husband, Bruce Charles, center, and Harry’s father, Tim Dunn, right, in Washington on Tuesday.\",\n" +
                "            \"copyright\": \"Manuel Balce Ceneta/Associated Press\",\n" +
                "            \"approved_for_syndication\": 1,\n" +
                "            \"media-metadata\": [\n" +
                "              {\n" +
                "                \"url\": \"https://static01.nyt.com/images/2019/10/16/world/16uk-accident/16uk-accident-thumbStandard.jpg\",\n" +
                "                \"format\": \"Standard Thumbnail\",\n" +
                "                \"height\": 75,\n" +
                "                \"width\": 75\n" +
                "              },\n" +
                "              {\n" +
                "                \"url\": \"https://static01.nyt.com/images/2019/10/16/world/16uk-accident/16uk-accident-mediumThreeByTwo210.jpg\",\n" +
                "                \"format\": \"mediumThreeByTwo210\",\n" +
                "                \"height\": 140,\n" +
                "                \"width\": 210\n" +
                "              },\n" +
                "              {\n" +
                "                \"url\": \"https://static01.nyt.com/images/2019/10/16/world/16uk-accident/16uk-accident-mediumThreeByTwo440.jpg\",\n" +
                "                \"format\": \"mediumThreeByTwo440\",\n" +
                "                \"height\": 293,\n" +
                "                \"width\": 440\n" +
                "              }\n" +
                "            ]\n" +
                "          }\n" +
                "        ],\n" +
                "        \"uri\": \"nyt://article/47e422b5-b908-55c5-9264-249a3d3d2d66\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"url\": \"https://www.nytimes.com/2019/10/17/us/politics/elijah-cummings-dead.html\",\n" +
                "        \"adx_keywords\": \"United States Politics and Government;Deaths (Obituaries);Cummings, Elijah E;Baltimore (Md);Congressional Black Caucus;House of Representatives;Democratic Party\",\n" +
                "        \"column\": null,\n" +
                "        \"section\": \"U.S.\",\n" +
                "        \"byline\": \"By SHERYL GAY STOLBERG and DAVID STOUT\",\n" +
                "        \"type\": \"Article\",\n" +
                "        \"title\": \"Elijah E. Cummings, Powerful Democrat Who Investigated Trump, Dies at 68\",\n" +
                "        \"abstract\": \"A son of sharecroppers, he fought tirelessly for his hometown, Baltimore, and became a key figure in the impeachment investigation of President Trump.\",\n" +
                "        \"published_date\": \"2019-10-17\",\n" +
                "        \"source\": \"The New York Times\",\n" +
                "        \"id\": 100000006732782,\n" +
                "        \"asset_id\": 100000006732782,\n" +
                "        \"views\": 4,\n" +
                "        \"des_facet\": [\n" +
                "          \"UNITED STATES POLITICS AND GOVERNMENT\",\n" +
                "          \"DEATHS (OBITUARIES)\"\n" +
                "        ],\n" +
                "        \"org_facet\": [\n" +
                "          \"CONGRESSIONAL BLACK CAUCUS\",\n" +
                "          \"HOUSE OF REPRESENTATIVES\",\n" +
                "          \"DEMOCRATIC PARTY\"\n" +
                "        ],\n" +
                "        \"per_facet\": [\n" +
                "          \"CUMMINGS, ELIJAH E\"\n" +
                "        ],\n" +
                "        \"geo_facet\": [\n" +
                "          \"BALTIMORE (MD)\"\n" +
                "        ],\n" +
                "        \"media\": [\n" +
                "          {\n" +
                "            \"type\": \"image\",\n" +
                "            \"subtype\": \"photo\",\n" +
                "            \"caption\": \"Representative Elijah E. Cummings in May.\",\n" +
                "            \"copyright\": \"Justin T. Gellerson for The New York Times\",\n" +
                "            \"approved_for_syndication\": 1,\n" +
                "            \"media-metadata\": [\n" +
                "              {\n" +
                "                \"url\": \"https://static01.nyt.com/images/2019/09/23/obituaries/00Cummings1-sub/00Cummings1-sub-thumbStandard.jpg\",\n" +
                "                \"format\": \"Standard Thumbnail\",\n" +
                "                \"height\": 75,\n" +
                "                \"width\": 75\n" +
                "              },\n" +
                "              {\n" +
                "                \"url\": \"https://static01.nyt.com/images/2019/09/23/obituaries/00Cummings1-sub/00Cummings1-sub-mediumThreeByTwo210.jpg\",\n" +
                "                \"format\": \"mediumThreeByTwo210\",\n" +
                "                \"height\": 140,\n" +
                "                \"width\": 210\n" +
                "              },\n" +
                "              {\n" +
                "                \"url\": \"https://static01.nyt.com/images/2019/09/23/obituaries/00Cummings1-sub/00Cummings1-sub-mediumThreeByTwo440.jpg\",\n" +
                "                \"format\": \"mediumThreeByTwo440\",\n" +
                "                \"height\": 293,\n" +
                "                \"width\": 440\n" +
                "              }\n" +
                "            ]\n" +
                "          }\n" +
                "        ],\n" +
                "        \"uri\": \"nyt://article/70aaf67f-eb6a-57f2-946b-03e0dd0d785c\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"url\": \"https://www.nytimes.com/2019/10/16/world/middleeast/trump-erdogan-turkey-syria-kurds.html\",\n" +
                "        \"adx_keywords\": \"Trump, Donald J;Syria;Turkey;Kurds;United States Defense and Military Forces;Defense and Military Forces;United States International Relations;Pompeo, Mike;Pence, Mike;Erdogan, Recep Tayyip;Syrian Democratic Forces;Islamic State in Iraq and Syria (ISIS)\",\n" +
                "        \"column\": null,\n" +
                "        \"section\": \"World\",\n" +
                "        \"byline\": \"By PETER BAKER and CATIE EDMONDSON\",\n" +
                "        \"type\": \"Article\",\n" +
                "        \"title\": \"Trump Lashes Out on Syria as Republicans Rebuke Him in House Vote\",\n" +
                "        \"abstract\": \"President Trump again defends his decision to withdraw American troops, an order that many, including Republicans, have interpreted as acquiescing to Turkey’s incursion against a United States ally.\",\n" +
                "        \"published_date\": \"2019-10-16\",\n" +
                "        \"source\": \"The New York Times\",\n" +
                "        \"id\": 100000006771909,\n" +
                "        \"asset_id\": 100000006771909,\n" +
                "        \"views\": 5,\n" +
                "        \"des_facet\": [\n" +
                "          \"KURDS\",\n" +
                "          \"UNITED STATES DEFENSE AND MILITARY FORCES\",\n" +
                "          \"DEFENSE AND MILITARY FORCES\",\n" +
                "          \"UNITED STATES INTERNATIONAL RELATIONS\"\n" +
                "        ],\n" +
                "        \"org_facet\": [\n" +
                "          \"SYRIAN DEMOCRATIC FORCES\",\n" +
                "          \"ISLAMIC STATE IN IRAQ AND SYRIA (ISIS)\"\n" +
                "        ],\n" +
                "        \"per_facet\": [\n" +
                "          \"TRUMP, DONALD J\",\n" +
                "          \"POMPEO, MIKE\",\n" +
                "          \"PENCE, MIKE\",\n" +
                "          \"ERDOGAN, RECEP TAYYIP\"\n" +
                "        ],\n" +
                "        \"geo_facet\": [\n" +
                "          \"SYRIA\",\n" +
                "          \"TURKEY\"\n" +
                "        ],\n" +
                "        \"media\": [\n" +
                "          {\n" +
                "            \"type\": \"image\",\n" +
                "            \"subtype\": \"photo\",\n" +
                "            \"caption\": \"Soldiers with the Turkey-backed Free Syrian Army crossing the border into Turkey from Syria on Wednesday.\",\n" +
                "            \"copyright\": \"Associated Press\",\n" +
                "            \"approved_for_syndication\": 1,\n" +
                "            \"media-metadata\": [\n" +
                "              {\n" +
                "                \"url\": \"https://static01.nyt.com/images/2019/10/16/us/politics/16dc-syria-vid/16dc-syria-vid-thumbStandard.jpg\",\n" +
                "                \"format\": \"Standard Thumbnail\",\n" +
                "                \"height\": 75,\n" +
                "                \"width\": 75\n" +
                "              },\n" +
                "              {\n" +
                "                \"url\": \"https://static01.nyt.com/images/2019/10/16/us/politics/16dc-syria-vid/merlin_162816024_71d1a87b-e885-4ee4-ae91-1cea6ec48415-mediumThreeByTwo210.jpg\",\n" +
                "                \"format\": \"mediumThreeByTwo210\",\n" +
                "                \"height\": 140,\n" +
                "                \"width\": 210\n" +
                "              },\n" +
                "              {\n" +
                "                \"url\": \"https://static01.nyt.com/images/2019/10/16/us/politics/16dc-syria-vid/merlin_162816024_71d1a87b-e885-4ee4-ae91-1cea6ec48415-mediumThreeByTwo440.jpg\",\n" +
                "                \"format\": \"mediumThreeByTwo440\",\n" +
                "                \"height\": 293,\n" +
                "                \"width\": 440\n" +
                "              }\n" +
                "            ]\n" +
                "          }\n" +
                "        ],\n" +
                "        \"uri\": \"nyt://article/43735d92-afdd-5e3a-bb5c-fe33578d8f0b\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"url\": \"https://www.nytimes.com/2019/10/16/world/asia/kim-jong-un-horse.html\",\n" +
                "        \"adx_keywords\": \"Horses;Kim Jong-un;Mount Paektu (North Korea)\",\n" +
                "        \"column\": null,\n" +
                "        \"section\": \"World\",\n" +
                "        \"byline\": \"By DANIEL VICTOR\",\n" +
                "        \"type\": \"Article\",\n" +
                "        \"title\": \"These Sure Are Photos of Kim Jong-un on a Horse\",\n" +
                "        \"abstract\": \"North Korea’s state news agency said the dictator’s eyes were “full of noble glitters” during his Putin-esque photo shoot.\",\n" +
                "        \"published_date\": \"2019-10-16\",\n" +
                "        \"source\": \"The New York Times\",\n" +
                "        \"id\": 100000006771119,\n" +
                "        \"asset_id\": 100000006771119,\n" +
                "        \"views\": 6,\n" +
                "        \"des_facet\": [\n" +
                "          \"HORSES\"\n" +
                "        ],\n" +
                "        \"org_facet\": \"\",\n" +
                "        \"per_facet\": [\n" +
                "          \"KIM JONG-UN\"\n" +
                "        ],\n" +
                "        \"geo_facet\": [\n" +
                "          \"MOUNT PAEKTU (NORTH KOREA)\"\n" +
                "        ],\n" +
                "        \"media\": [\n" +
                "          {\n" +
                "            \"type\": \"image\",\n" +
                "            \"subtype\": \"photo\",\n" +
                "            \"caption\": \"Kim Jong-un, the North Korean dictator, on a horse in a photo released Wednesday by the country’s official news agency. \",\n" +
                "            \"copyright\": \"Korean Central News Agency\",\n" +
                "            \"approved_for_syndication\": 0,\n" +
                "            \"media-metadata\": [\n" +
                "              {\n" +
                "                \"url\": \"https://static01.nyt.com/images/2019/10/16/world/16xp-kim-horse1/16xp-kim-horse1-thumbStandard.jpg\",\n" +
                "                \"format\": \"Standard Thumbnail\",\n" +
                "                \"height\": 75,\n" +
                "                \"width\": 75\n" +
                "              },\n" +
                "              {\n" +
                "                \"url\": \"https://static01.nyt.com/images/2019/10/16/world/16xp-kim-horse1/16xp-kim-horse1-mediumThreeByTwo210.jpg\",\n" +
                "                \"format\": \"mediumThreeByTwo210\",\n" +
                "                \"height\": 140,\n" +
                "                \"width\": 210\n" +
                "              },\n" +
                "              {\n" +
                "                \"url\": \"https://static01.nyt.com/images/2019/10/16/world/16xp-kim-horse1/16xp-kim-horse1-mediumThreeByTwo440.jpg\",\n" +
                "                \"format\": \"mediumThreeByTwo440\",\n" +
                "                \"height\": 293,\n" +
                "                \"width\": 440\n" +
                "              }\n" +
                "            ]\n" +
                "          }\n" +
                "        ],\n" +
                "        \"uri\": \"nyt://article/e4435c42-35a8-5c41-ac7c-9b712949908a\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"url\": \"https://www.nytimes.com/2019/10/16/world/europe/dutch-family-farmhouse-doomsday.html\",\n" +
                "        \"adx_keywords\": \"Doomsday;Netherlands\",\n" +
                "        \"column\": null,\n" +
                "        \"section\": \"World\",\n" +
                "        \"byline\": \"By MARC SANTORA\",\n" +
                "        \"type\": \"Article\",\n" +
                "        \"title\": \"Family Spent 9 Years in a Secluded Dutch Farmhouse ‘Waiting for the End of Days’\",\n" +
                "        \"abstract\": \"The case came to the attention of the local police after a young man left the farm, found his way to a local pub, and told his story.\",\n" +
                "        \"published_date\": \"2019-10-16\",\n" +
                "        \"source\": \"The New York Times\",\n" +
                "        \"id\": 100000006771501,\n" +
                "        \"asset_id\": 100000006771501,\n" +
                "        \"views\": 7,\n" +
                "        \"des_facet\": [\n" +
                "          \"DOOMSDAY\"\n" +
                "        ],\n" +
                "        \"org_facet\": \"\",\n" +
                "        \"per_facet\": \"\",\n" +
                "        \"geo_facet\": [\n" +
                "          \"NETHERLANDS\"\n" +
                "        ],\n" +
                "        \"media\": [\n" +
                "          {\n" +
                "            \"type\": \"image\",\n" +
                "            \"subtype\": \"photo\",\n" +
                "            \"caption\": \"An aerial picture of the farmhouse near the village of Ruinerwold, Netherlands, where a family took refuge waiting for the world’s end.\",\n" +
                "            \"copyright\": \"Wilbert Bijzitter/ANP, via Agence France-Presse — Getty Images\",\n" +
                "            \"approved_for_syndication\": 1,\n" +
                "            \"media-metadata\": [\n" +
                "              {\n" +
                "                \"url\": \"https://static01.nyt.com/images/2019/10/16/world/16dutch-farm/16dutch-farm-thumbStandard.jpg\",\n" +
                "                \"format\": \"Standard Thumbnail\",\n" +
                "                \"height\": 75,\n" +
                "                \"width\": 75\n" +
                "              },\n" +
                "              {\n" +
                "                \"url\": \"https://static01.nyt.com/images/2019/10/16/world/16dutch-farm/16dutch-farm-mediumThreeByTwo210-v2.jpg\",\n" +
                "                \"format\": \"mediumThreeByTwo210\",\n" +
                "                \"height\": 140,\n" +
                "                \"width\": 210\n" +
                "              },\n" +
                "              {\n" +
                "                \"url\": \"https://static01.nyt.com/images/2019/10/16/world/16dutch-farm/16dutch-farm-mediumThreeByTwo440-v2.jpg\",\n" +
                "                \"format\": \"mediumThreeByTwo440\",\n" +
                "                \"height\": 293,\n" +
                "                \"width\": 440\n" +
                "              }\n" +
                "            ]\n" +
                "          }\n" +
                "        ],\n" +
                "        \"uri\": \"nyt://article/fdc6231b-1c77-5186-a2a9-36faa6acabdd\"\n" +
                "      }\n" +
                "    ]\n" +
                "}";
    }

    public static String getCurrentHardcoverFictionBestsellers() {
        return "{\n" +
                "  \"status\": \"OK\",\n" +
                "  \"copyright\": \"Copyright (c) 2019 The New York Times Company.  All Rights Reserved.\",\n" +
                "  \"num_results\": 15,\n" +
                "  \"last_modified\": \"2019-10-17T16:01:03-04:00\",\n" +
                "  \"results\": {\n" +
                "    \"list_name\": \"Hardcover Fiction\",\n" +
                "    \"list_name_encoded\": \"hardcover-fiction\",\n" +
                "    \"bestsellers_date\": \"2019-10-12\",\n" +
                "    \"published_date\": \"2019-10-27\",\n" +
                "    \"published_date_description\": \"latest\",\n" +
                "    \"next_published_date\": \"\",\n" +
                "    \"previous_published_date\": \"2019-10-20\",\n" +
                "    \"display_name\": \"Hardcover Fiction\",\n" +
                "    \"normal_list_ends_at\": 15,\n" +
                "    \"updated\": \"WEEKLY\",\n" +
                "    \"books\": [\n" +
                "      {\n" +
                "        \"rank\": 1,\n" +
                "        \"rank_last_week\": 0,\n" +
                "        \"weeks_on_list\": 1,\n" +
                "        \"asterisk\": 0,\n" +
                "        \"dagger\": 0,\n" +
                "        \"primary_isbn10\": \"0316420271\",\n" +
                "        \"primary_isbn13\": \"9780316420273\",\n" +
                "        \"publisher\": \"Little, Brown\",\n" +
                "        \"description\": \"In the 19th installment of the Women's Murder Club series, detective Lindsay Boxer and company take on a fearsome criminal known only as \\\"Loman.\\\"\",\n" +
                "        \"price\": 0,\n" +
                "        \"title\": \"THE 19TH CHRISTMAS\",\n" +
                "        \"author\": \"James Patterson and Maxine Paetro\",\n" +
                "        \"contributor\": \"by James Patterson and Maxine Paetro\",\n" +
                "        \"contributor_note\": \"\",\n" +
                "        \"book_image\": \"https://s1.nyt.com/du/books/images/9780316494021.jpg\",\n" +
                "        \"book_image_width\": 321,\n" +
                "        \"book_image_height\": 495,\n" +
                "        \"amazon_product_url\": \"https://www.amazon.com/19th-Christmas-Womens-Murder-Club-ebook/dp/B07P1SSF9S?tag=NYTBS-20\",\n" +
                "        \"age_group\": \"\",\n" +
                "        \"book_review_link\": \"\",\n" +
                "        \"first_chapter_link\": \"\",\n" +
                "        \"sunday_review_link\": \"\",\n" +
                "        \"article_chapter_link\": \"\",\n" +
                "        \"isbns\": [\n" +
                "          {\n" +
                "            \"isbn10\": \"0316420271\",\n" +
                "            \"isbn13\": \"9780316420273\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"isbn10\": \"031649402X\",\n" +
                "            \"isbn13\": \"9780316494021\"\n" +
                "          }\n" +
                "        ],\n" +
                "        \"buy_links\": [\n" +
                "          {\n" +
                "            \"name\": \"Amazon\",\n" +
                "            \"url\": \"https://www.amazon.com/19th-Christmas-Womens-Murder-Club-ebook/dp/B07P1SSF9S?tag=NYTBS-20\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"name\": \"Apple Books\",\n" +
                "            \"url\": \"http://du-gae-books-dot-nyt-du-prd.appspot.com/buy?title=THE+19TH+CHRISTMAS&author=James+Patterson+and+Maxine+Paetro\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"name\": \"Barnes and Noble\",\n" +
                "            \"url\": \"http://www.anrdoezrs.net/click-7990613-11819508?url=http%3A%2F%2Fwww.barnesandnoble.com%2Fw%2F%3Fean%3D9780316420273\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"name\": \"Local Booksellers\",\n" +
                "            \"url\": \"http://www.indiebound.org/book/9780316420273?aff=NYT\"\n" +
                "          }\n" +
                "        ],\n" +
                "        \"book_uri\": \"nyt://book/8a6cd41d-3325-5e3d-a20e-7e051a28014e\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"rank\": 2,\n" +
                "        \"rank_last_week\": 3,\n" +
                "        \"weeks_on_list\": 58,\n" +
                "        \"asterisk\": 0,\n" +
                "        \"dagger\": 0,\n" +
                "        \"primary_isbn10\": \"0735219095\",\n" +
                "        \"primary_isbn13\": \"9780735219090\",\n" +
                "        \"publisher\": \"Putnam\",\n" +
                "        \"description\": \"A woman who survived alone in the marsh becomes a murder suspect.\",\n" +
                "        \"price\": 0,\n" +
                "        \"title\": \"WHERE THE CRAWDADS SING\",\n" +
                "        \"author\": \"Delia Owens\",\n" +
                "        \"contributor\": \"by Delia Owens\",\n" +
                "        \"contributor_note\": \"\",\n" +
                "        \"book_image\": \"https://s1.nyt.com/du/books/images/9780735219090.jpg\",\n" +
                "        \"book_image_width\": 328,\n" +
                "        \"book_image_height\": 495,\n" +
                "        \"amazon_product_url\": \"https://www.amazon.com/Where-Crawdads-Sing-Delia-Owens/dp/0735219095?tag=NYTBS-20\",\n" +
                "        \"age_group\": \"\",\n" +
                "        \"book_review_link\": \"\",\n" +
                "        \"first_chapter_link\": \"\",\n" +
                "        \"sunday_review_link\": \"\",\n" +
                "        \"article_chapter_link\": \"\",\n" +
                "        \"isbns\": [\n" +
                "          {\n" +
                "            \"isbn10\": \"0735219095\",\n" +
                "            \"isbn13\": \"9780735219090\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"isbn10\": \"0735219117\",\n" +
                "            \"isbn13\": \"9780735219113\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"isbn10\": \"0525640371\",\n" +
                "            \"isbn13\": \"9780525640370\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"isbn10\": \"0593105419\",\n" +
                "            \"isbn13\": \"9780593105412\"\n" +
                "          }\n" +
                "        ],\n" +
                "        \"buy_links\": [\n" +
                "          {\n" +
                "            \"name\": \"Amazon\",\n" +
                "            \"url\": \"https://www.amazon.com/Where-Crawdads-Sing-Delia-Owens/dp/0735219095?tag=NYTBS-20\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"name\": \"Apple Books\",\n" +
                "            \"url\": \"http://du-gae-books-dot-nyt-du-prd.appspot.com/buy?title=WHERE+THE+CRAWDADS+SING&author=Delia+Owens\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"name\": \"Barnes and Noble\",\n" +
                "            \"url\": \"http://www.anrdoezrs.net/click-7990613-11819508?url=http%3A%2F%2Fwww.barnesandnoble.com%2Fw%2F%3Fean%3D9780735219090\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"name\": \"Local Booksellers\",\n" +
                "            \"url\": \"http://www.indiebound.org/book/9780735219090?aff=NYT\"\n" +
                "          }\n" +
                "        ],\n" +
                "        \"book_uri\": \"nyt://book/053b4109-4555-5aa1-9b39-cc40549bcdf0\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"rank\": 3,\n" +
                "        \"rank_last_week\": 0,\n" +
                "        \"weeks_on_list\": 1,\n" +
                "        \"asterisk\": 0,\n" +
                "        \"dagger\": 0,\n" +
                "        \"primary_isbn10\": \"0316435570\",\n" +
                "        \"primary_isbn13\": \"9780316435574\",\n" +
                "        \"publisher\": \"Little, Brown\",\n" +
                "        \"description\": \"In the sequel to \\\"Winter in Paradise,\\\" Irene Steele visits the island of St. John to get to the bottom of the mysterious life and death of her husband.\",\n" +
                "        \"price\": 0,\n" +
                "        \"title\": \"WHAT HAPPENS IN PARADISE\",\n" +
                "        \"author\": \"Elin Hilderbrand\",\n" +
                "        \"contributor\": \"by Elin Hilderbrand\",\n" +
                "        \"contributor_note\": \"\",\n" +
                "        \"book_image\": \"https://s1.nyt.com/du/books/images/9780316435574.jpg\",\n" +
                "        \"book_image_width\": 319,\n" +
                "        \"book_image_height\": 495,\n" +
                "        \"amazon_product_url\": \"https://www.amazon.com/What-Happens-Paradise-Elin-Hilderbrand/dp/0316435570?tag=NYTBS-20\",\n" +
                "        \"age_group\": \"\",\n" +
                "        \"book_review_link\": \"\",\n" +
                "        \"first_chapter_link\": \"\",\n" +
                "        \"sunday_review_link\": \"\",\n" +
                "        \"article_chapter_link\": \"\",\n" +
                "        \"isbns\": [\n" +
                "          {\n" +
                "            \"isbn10\": \"0316435570\",\n" +
                "            \"isbn13\": \"9780316435574\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"isbn10\": \"0316426075\",\n" +
                "            \"isbn13\": \"9780316426077\"\n" +
                "          }\n" +
                "        ],\n" +
                "        \"buy_links\": [\n" +
                "          {\n" +
                "            \"name\": \"Amazon\",\n" +
                "            \"url\": \"https://www.amazon.com/What-Happens-Paradise-Elin-Hilderbrand/dp/0316435570?tag=NYTBS-20\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"name\": \"Apple Books\",\n" +
                "            \"url\": \"http://du-gae-books-dot-nyt-du-prd.appspot.com/buy?title=WHAT+HAPPENS+IN+PARADISE&author=Elin+Hilderbrand\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"name\": \"Barnes and Noble\",\n" +
                "            \"url\": \"http://www.anrdoezrs.net/click-7990613-11819508?url=http%3A%2F%2Fwww.barnesandnoble.com%2Fw%2F%3Fean%3D9780316435574\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"name\": \"Local Booksellers\",\n" +
                "            \"url\": \"http://www.indiebound.org/book/9780316435574?aff=NYT\"\n" +
                "          }\n" +
                "        ],\n" +
                "        \"book_uri\": \"nyt://book/8ba462d1-3a6a-5728-8922-532bbcf58680\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"rank\": 4,\n" +
                "        \"rank_last_week\": 0,\n" +
                "        \"weeks_on_list\": 1,\n" +
                "        \"asterisk\": 0,\n" +
                "        \"dagger\": 0,\n" +
                "        \"primary_isbn10\": \"1250313074\",\n" +
                "        \"primary_isbn13\": \"9781250313072\",\n" +
                "        \"publisher\": \"Flatiron\",\n" +
                "        \"description\": \"After mysteriously surviving a multiple homicide, Galaxy Stern comes face to face with dark magic, murder and more at Yale University.\",\n" +
                "        \"price\": 0,\n" +
                "        \"title\": \"NINTH HOUSE\",\n" +
                "        \"author\": \"Leigh Bardugo\",\n" +
                "        \"contributor\": \"by Leigh Bardugo\",\n" +
                "        \"contributor_note\": \"\",\n" +
                "        \"book_image\": \"https://s1.nyt.com/du/books/images/9781250313072.jpg\",\n" +
                "        \"book_image_width\": 325,\n" +
                "        \"book_image_height\": 495,\n" +
                "        \"amazon_product_url\": \"https://www.amazon.com/Ninth-House-Leigh-Bardugo/dp/1250313074?tag=NYTBS-20\",\n" +
                "        \"age_group\": \"\",\n" +
                "        \"book_review_link\": \"https://www.nytimes.com/2019/10/08/books/review/ninth-house-leigh-bardugo.html\",\n" +
                "        \"first_chapter_link\": \"\",\n" +
                "        \"sunday_review_link\": \"\",\n" +
                "        \"article_chapter_link\": \"\",\n" +
                "        \"isbns\": [\n" +
                "          {\n" +
                "            \"isbn10\": \"1250313074\",\n" +
                "            \"isbn13\": \"9781250313072\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"isbn10\": \"1250266459\",\n" +
                "            \"isbn13\": \"9781250266453\"\n" +
                "          }\n" +
                "        ],\n" +
                "        \"buy_links\": [\n" +
                "          {\n" +
                "            \"name\": \"Amazon\",\n" +
                "            \"url\": \"https://www.amazon.com/Ninth-House-Leigh-Bardugo/dp/1250313074?tag=NYTBS-20\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"name\": \"Apple Books\",\n" +
                "            \"url\": \"http://du-gae-books-dot-nyt-du-prd.appspot.com/buy?title=NINTH+HOUSE&author=Leigh+Bardugo\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"name\": \"Barnes and Noble\",\n" +
                "            \"url\": \"http://www.anrdoezrs.net/click-7990613-11819508?url=http%3A%2F%2Fwww.barnesandnoble.com%2Fw%2F%3Fean%3D9781250313072\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"name\": \"Local Booksellers\",\n" +
                "            \"url\": \"http://www.indiebound.org/book/9781250313072?aff=NYT\"\n" +
                "          }\n" +
                "        ],\n" +
                "        \"book_uri\": \"nyt://book/65f94f17-7cfb-508e-99c4-ec09ead9948c\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"rank\": 5,\n" +
                "        \"rank_last_week\": 2,\n" +
                "        \"weeks_on_list\": 5,\n" +
                "        \"asterisk\": 0,\n" +
                "        \"dagger\": 0,\n" +
                "        \"primary_isbn10\": \"1982110562\",\n" +
                "        \"primary_isbn13\": \"9781982110567\",\n" +
                "        \"publisher\": \"Scribner\",\n" +
                "        \"description\": \"Children with special talents are abducted and sequestered in an institution where the sinister staff seeks to extract their gifts through harsh methods.\",\n" +
                "        \"price\": 0,\n" +
                "        \"title\": \"THE INSTITUTE\",\n" +
                "        \"author\": \"Stephen King\",\n" +
                "        \"contributor\": \"by Stephen King\",\n" +
                "        \"contributor_note\": \"\",\n" +
                "        \"book_image\": \"https://s1.nyt.com/du/books/images/9781982110567.jpg\",\n" +
                "        \"book_image_width\": 328,\n" +
                "        \"book_image_height\": 495,\n" +
                "        \"amazon_product_url\": \"https://www.amazon.com/Institute-Novel-Stephen-King/dp/1982110562?tag=NYTBS-20\",\n" +
                "        \"age_group\": \"\",\n" +
                "        \"book_review_link\": \"https://www.nytimes.com/2019/09/08/books/review-institute-stephen-king.html\",\n" +
                "        \"first_chapter_link\": \"\",\n" +
                "        \"sunday_review_link\": \"\",\n" +
                "        \"article_chapter_link\": \"\",\n" +
                "        \"isbns\": [\n" +
                "          {\n" +
                "            \"isbn10\": \"1982110562\",\n" +
                "            \"isbn13\": \"9781982110567\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"isbn10\": \"1982110597\",\n" +
                "            \"isbn13\": \"9781982110598\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"isbn10\": \"1508279071\",\n" +
                "            \"isbn13\": \"9781508279075\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"isbn10\": \"1508279063\",\n" +
                "            \"isbn13\": \"9781508279068\"\n" +
                "          }\n" +
                "        ],\n" +
                "        \"buy_links\": [\n" +
                "          {\n" +
                "            \"name\": \"Amazon\",\n" +
                "            \"url\": \"https://www.amazon.com/Institute-Novel-Stephen-King/dp/1982110562?tag=NYTBS-20\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"name\": \"Apple Books\",\n" +
                "            \"url\": \"http://du-gae-books-dot-nyt-du-prd.appspot.com/buy?title=THE+INSTITUTE&author=Stephen+King\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"name\": \"Barnes and Noble\",\n" +
                "            \"url\": \"http://www.anrdoezrs.net/click-7990613-11819508?url=http%3A%2F%2Fwww.barnesandnoble.com%2Fw%2F%3Fean%3D9781982110567\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"name\": \"Local Booksellers\",\n" +
                "            \"url\": \"http://www.indiebound.org/book/9781982110567?aff=NYT\"\n" +
                "          }\n" +
                "        ],\n" +
                "        \"book_uri\": \"nyt://book/ef08eed0-f900-53fe-9764-da9152bd5e8f\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"rank\": 6,\n" +
                "        \"rank_last_week\": 1,\n" +
                "        \"weeks_on_list\": 3,\n" +
                "        \"asterisk\": 0,\n" +
                "        \"dagger\": 0,\n" +
                "        \"primary_isbn10\": \"0399590595\",\n" +
                "        \"primary_isbn13\": \"9780399590597\",\n" +
                "        \"publisher\": \"One World\",\n" +
                "        \"description\": \"A young man who was gifted with a mysterious power becomes part of a war between slavers and the enslaved.\",\n" +
                "        \"price\": 0,\n" +
                "        \"title\": \"THE WATER DANCER\",\n" +
                "        \"author\": \"Ta-Nehisi Coates\",\n" +
                "        \"contributor\": \"by Ta-Nehisi Coates\",\n" +
                "        \"contributor_note\": \"\",\n" +
                "        \"book_image\": \"https://s1.nyt.com/du/books/images/9780399590597.jpg\",\n" +
                "        \"book_image_width\": 326,\n" +
                "        \"book_image_height\": 495,\n" +
                "        \"amazon_product_url\": \"https://www.amazon.com/Water-Dancer-Oprahs-Book-Club/dp/0399590595?tag=NYTBS-20\",\n" +
                "        \"age_group\": \"\",\n" +
                "        \"book_review_link\": \"https://www.nytimes.com/2019/09/20/books/review-water-dancer-ta-nehisi-coates.html\",\n" +
                "        \"first_chapter_link\": \"\",\n" +
                "        \"sunday_review_link\": \"\",\n" +
                "        \"article_chapter_link\": \"\",\n" +
                "        \"isbns\": [\n" +
                "          {\n" +
                "            \"isbn10\": \"0399590595\",\n" +
                "            \"isbn13\": \"9780399590597\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"isbn10\": \"0525494847\",\n" +
                "            \"isbn13\": \"9780525494843\"\n" +
                "          }\n" +
                "        ],\n" +
                "        \"buy_links\": [\n" +
                "          {\n" +
                "            \"name\": \"Amazon\",\n" +
                "            \"url\": \"https://www.amazon.com/Water-Dancer-Oprahs-Book-Club/dp/0399590595?tag=NYTBS-20\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"name\": \"Apple Books\",\n" +
                "            \"url\": \"http://du-gae-books-dot-nyt-du-prd.appspot.com/buy?title=THE+WATER+DANCER&author=Ta-Nehisi+Coates\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"name\": \"Barnes and Noble\",\n" +
                "            \"url\": \"http://www.anrdoezrs.net/click-7990613-11819508?url=http%3A%2F%2Fwww.barnesandnoble.com%2Fw%2F%3Fean%3D9780399590597\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"name\": \"Local Booksellers\",\n" +
                "            \"url\": \"http://www.indiebound.org/book/9780399590597?aff=NYT\"\n" +
                "          }\n" +
                "        ],\n" +
                "        \"book_uri\": \"nyt://book/30d61b66-0e7d-582c-a3ab-ddce005d5361\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"rank\": 7,\n" +
                "        \"rank_last_week\": 4,\n" +
                "        \"weeks_on_list\": 3,\n" +
                "        \"asterisk\": 0,\n" +
                "        \"dagger\": 0,\n" +
                "        \"primary_isbn10\": \"0062963678\",\n" +
                "        \"primary_isbn13\": \"9780062963673\",\n" +
                "        \"publisher\": \"Harper\",\n" +
                "        \"description\": \"A sibling relationship is impacted when the family goes from poverty to wealth and back again over the course of many decades.\",\n" +
                "        \"price\": 0,\n" +
                "        \"title\": \"THE DUTCH HOUSE\",\n" +
                "        \"author\": \"Ann Patchett\",\n" +
                "        \"contributor\": \"by Ann Patchett\",\n" +
                "        \"contributor_note\": \"\",\n" +
                "        \"book_image\": \"https://s1.nyt.com/du/books/images/9780062963673.jpg\",\n" +
                "        \"book_image_width\": 328,\n" +
                "        \"book_image_height\": 495,\n" +
                "        \"amazon_product_url\": \"https://www.amazon.com/Dutch-House-Novel-Ann-Patchett/dp/0062963678?tag=NYTBS-20\",\n" +
                "        \"age_group\": \"\",\n" +
                "        \"book_review_link\": \"https://www.nytimes.com/2019/09/21/books/review-dutch-house-ann-patchett.html\",\n" +
                "        \"first_chapter_link\": \"\",\n" +
                "        \"sunday_review_link\": \"\",\n" +
                "        \"article_chapter_link\": \"\",\n" +
                "        \"isbns\": [\n" +
                "          {\n" +
                "            \"isbn10\": \"0062963678\",\n" +
                "            \"isbn13\": \"9780062963673\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"isbn10\": \"0062963694\",\n" +
                "            \"isbn13\": \"9780062963697\"\n" +
                "          }\n" +
                "        ],\n" +
                "        \"buy_links\": [\n" +
                "          {\n" +
                "            \"name\": \"Amazon\",\n" +
                "            \"url\": \"https://www.amazon.com/Dutch-House-Novel-Ann-Patchett/dp/0062963678?tag=NYTBS-20\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"name\": \"Apple Books\",\n" +
                "            \"url\": \"http://du-gae-books-dot-nyt-du-prd.appspot.com/buy?title=THE+DUTCH+HOUSE&author=Ann+Patchett\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"name\": \"Barnes and Noble\",\n" +
                "            \"url\": \"http://www.anrdoezrs.net/click-7990613-11819508?url=http%3A%2F%2Fwww.barnesandnoble.com%2Fw%2F%3Fean%3D9780062963673\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"name\": \"Local Booksellers\",\n" +
                "            \"url\": \"http://www.indiebound.org/book/9780062963673?aff=NYT\"\n" +
                "          }\n" +
                "        ],\n" +
                "        \"book_uri\": \"nyt://book/0ad5db6c-4d15-5624-bef3-1385f93f78e2\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"rank\": 8,\n" +
                "        \"rank_last_week\": 6,\n" +
                "        \"weeks_on_list\": 5,\n" +
                "        \"asterisk\": 0,\n" +
                "        \"dagger\": 0,\n" +
                "        \"primary_isbn10\": \"0385543786\",\n" +
                "        \"primary_isbn13\": \"9780385543781\",\n" +
                "        \"publisher\": \"Nan A. Talese/Doubleday\",\n" +
                "        \"description\": \"In a sequel to “The Handmaid’s Tale,” old secrets bring three women together as the Republic of Gilead’s theocratic regime shows signs of decay.\",\n" +
                "        \"price\": 0,\n" +
                "        \"title\": \"THE TESTAMENTS\",\n" +
                "        \"author\": \"Margaret Atwood\",\n" +
                "        \"contributor\": \"by Margaret Atwood\",\n" +
                "        \"contributor_note\": \"\",\n" +
                "        \"book_image\": \"https://s1.nyt.com/du/books/images/9780385543781.jpg\",\n" +
                "        \"book_image_width\": 326,\n" +
                "        \"book_image_height\": 495,\n" +
                "        \"amazon_product_url\": \"https://www.amazon.com/Testaments-Sequel-Handmaids-Tale/dp/0385543786?tag=NYTBS-20\",\n" +
                "        \"age_group\": \"\",\n" +
                "        \"book_review_link\": \"\",\n" +
                "        \"first_chapter_link\": \"\",\n" +
                "        \"sunday_review_link\": \"\",\n" +
                "        \"article_chapter_link\": \"\",\n" +
                "        \"isbns\": [\n" +
                "          {\n" +
                "            \"isbn10\": \"0385543786\",\n" +
                "            \"isbn13\": \"9780385543781\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"isbn10\": \"0385543794\",\n" +
                "            \"isbn13\": \"9780385543798\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"isbn10\": \"0525590455\",\n" +
                "            \"isbn13\": \"9780525590453\"\n" +
                "          }\n" +
                "        ],\n" +
                "        \"buy_links\": [\n" +
                "          {\n" +
                "            \"name\": \"Amazon\",\n" +
                "            \"url\": \"https://www.amazon.com/Testaments-Sequel-Handmaids-Tale/dp/0385543786?tag=NYTBS-20\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"name\": \"Apple Books\",\n" +
                "            \"url\": \"http://du-gae-books-dot-nyt-du-prd.appspot.com/buy?title=THE+TESTAMENTS&author=Margaret+Atwood\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"name\": \"Barnes and Noble\",\n" +
                "            \"url\": \"http://www.anrdoezrs.net/click-7990613-11819508?url=http%3A%2F%2Fwww.barnesandnoble.com%2Fw%2F%3Fean%3D9780385543781\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"name\": \"Local Booksellers\",\n" +
                "            \"url\": \"http://www.indiebound.org/book/9780385543781?aff=NYT\"\n" +
                "          }\n" +
                "        ],\n" +
                "        \"book_uri\": \"nyt://book/e1e18717-04bb-51a2-942a-45743507535f\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"rank\": 9,\n" +
                "        \"rank_last_week\": 0,\n" +
                "        \"weeks_on_list\": 1,\n" +
                "        \"asterisk\": 0,\n" +
                "        \"dagger\": 0,\n" +
                "        \"primary_isbn10\": \"039917950X\",\n" +
                "        \"primary_isbn13\": \"9780399179501\",\n" +
                "        \"publisher\": \"Delacorte\",\n" +
                "        \"description\": \"A prestigious New York lawyer learns that the life she constructed for her children and herself isn't exactly what she thought it was.\",\n" +
                "        \"price\": 0,\n" +
                "        \"title\": \"CHILD'S PLAY\",\n" +
                "        \"author\": \"Danielle Steel\",\n" +
                "        \"contributor\": \"by Danielle Steel\",\n" +
                "        \"contributor_note\": \"\",\n" +
                "        \"book_image\": \"https://s1.nyt.com/du/books/images/9780399179518.jpg\",\n" +
                "        \"book_image_width\": 326,\n" +
                "        \"book_image_height\": 495,\n" +
                "        \"amazon_product_url\": \"https://www.amazon.com/Childs-Play-Novel-Danielle-Steel-ebook/dp/B07MGDJT1N?tag=NYTBS-20\",\n" +
                "        \"age_group\": \"\",\n" +
                "        \"book_review_link\": \"\",\n" +
                "        \"first_chapter_link\": \"\",\n" +
                "        \"sunday_review_link\": \"\",\n" +
                "        \"article_chapter_link\": \"\",\n" +
                "        \"isbns\": [\n" +
                "          {\n" +
                "            \"isbn10\": \"039917950X\",\n" +
                "            \"isbn13\": \"9780399179501\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"isbn10\": \"0399179518\",\n" +
                "            \"isbn13\": \"9780399179518\"\n" +
                "          }\n" +
                "        ],\n" +
                "        \"buy_links\": [\n" +
                "          {\n" +
                "            \"name\": \"Amazon\",\n" +
                "            \"url\": \"https://www.amazon.com/Childs-Play-Novel-Danielle-Steel-ebook/dp/B07MGDJT1N?tag=NYTBS-20\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"name\": \"Apple Books\",\n" +
                "            \"url\": \"http://du-gae-books-dot-nyt-du-prd.appspot.com/buy?title=CHILD%27S+PLAY&author=Danielle+Steel\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"name\": \"Barnes and Noble\",\n" +
                "            \"url\": \"http://www.anrdoezrs.net/click-7990613-11819508?url=http%3A%2F%2Fwww.barnesandnoble.com%2Fw%2F%3Fean%3D9780399179501\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"name\": \"Local Booksellers\",\n" +
                "            \"url\": \"http://www.indiebound.org/book/9780399179501?aff=NYT\"\n" +
                "          }\n" +
                "        ],\n" +
                "        \"book_uri\": \"nyt://book/7425ca98-5374-5a6c-8381-890b33710a6b\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"rank\": 10,\n" +
                "        \"rank_last_week\": 0,\n" +
                "        \"weeks_on_list\": 1,\n" +
                "        \"asterisk\": 0,\n" +
                "        \"dagger\": 0,\n" +
                "        \"primary_isbn10\": \"0399562486\",\n" +
                "        \"primary_isbn13\": \"9780399562488\",\n" +
                "        \"publisher\": \"Pamela Dorman/Viking\",\n" +
                "        \"description\": \"In Depression-era America, five women refuse to be cowed by men or convention as they deliver books throughout the mountains of Kentucky.\",\n" +
                "        \"price\": 0,\n" +
                "        \"title\": \"THE GIVER OF STARS\",\n" +
                "        \"author\": \"Jojo Moyes\",\n" +
                "        \"contributor\": \"by Jojo Moyes\",\n" +
                "        \"contributor_note\": \"\",\n" +
                "        \"book_image\": \"https://s1.nyt.com/du/books/images/9780399562501.jpg\",\n" +
                "        \"book_image_width\": 328,\n" +
                "        \"book_image_height\": 495,\n" +
                "        \"amazon_product_url\": \"https://www.amazon.com/Giver-Stars-Novel-Jojo-Moyes/dp/0399562486?tag=NYTBS-20\",\n" +
                "        \"age_group\": \"\",\n" +
                "        \"book_review_link\": \"\",\n" +
                "        \"first_chapter_link\": \"\",\n" +
                "        \"sunday_review_link\": \"\",\n" +
                "        \"article_chapter_link\": \"\",\n" +
                "        \"isbns\": [\n" +
                "          {\n" +
                "            \"isbn10\": \"0399562486\",\n" +
                "            \"isbn13\": \"9780399562488\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"isbn10\": \"0399562508\",\n" +
                "            \"isbn13\": \"9780399562501\"\n" +
                "          }\n" +
                "        ],\n" +
                "        \"buy_links\": [\n" +
                "          {\n" +
                "            \"name\": \"Amazon\",\n" +
                "            \"url\": \"https://www.amazon.com/Giver-Stars-Novel-Jojo-Moyes/dp/0399562486?tag=NYTBS-20\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"name\": \"Apple Books\",\n" +
                "            \"url\": \"http://du-gae-books-dot-nyt-du-prd.appspot.com/buy?title=THE+GIVER+OF+STARS&author=Jojo+Moyes\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"name\": \"Barnes and Noble\",\n" +
                "            \"url\": \"http://www.anrdoezrs.net/click-7990613-11819508?url=http%3A%2F%2Fwww.barnesandnoble.com%2Fw%2F%3Fean%3D9780399562488\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"name\": \"Local Booksellers\",\n" +
                "            \"url\": \"http://www.indiebound.org/book/9780399562488?aff=NYT\"\n" +
                "          }\n" +
                "        ],\n" +
                "        \"book_uri\": \"nyt://book/0365e66e-8090-5ec1-8d8c-2ed89027d374\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"rank\": 11,\n" +
                "        \"rank_last_week\": 5,\n" +
                "        \"weeks_on_list\": 2,\n" +
                "        \"asterisk\": 0,\n" +
                "        \"dagger\": 0,\n" +
                "        \"primary_isbn10\": \"0525536612\",\n" +
                "        \"primary_isbn13\": \"9780525536611\",\n" +
                "        \"publisher\": \"Putnam\",\n" +
                "        \"description\": \"The 12th book in the Virgil Flowers series. A fight between university departments turns deadly.\",\n" +
                "        \"price\": 0,\n" +
                "        \"title\": \"BLOODY GENIUS\",\n" +
                "        \"author\": \"John Sandford\",\n" +
                "        \"contributor\": \"by John Sandford\",\n" +
                "        \"contributor_note\": \"\",\n" +
                "        \"book_image\": \"https://s1.nyt.com/du/books/images/9780525536611.jpg\",\n" +
                "        \"book_image_width\": 328,\n" +
                "        \"book_image_height\": 495,\n" +
                "        \"amazon_product_url\": \"https://www.amazon.com/Bloody-Genius-Virgil-Flowers-Novel/dp/0525536612?tag=NYTBS-20\",\n" +
                "        \"age_group\": \"\",\n" +
                "        \"book_review_link\": \"\",\n" +
                "        \"first_chapter_link\": \"\",\n" +
                "        \"sunday_review_link\": \"\",\n" +
                "        \"article_chapter_link\": \"\",\n" +
                "        \"isbns\": [\n" +
                "          {\n" +
                "            \"isbn10\": \"0525536612\",\n" +
                "            \"isbn13\": \"9780525536611\"\n" +
                "          }\n" +
                "        ],\n" +
                "        \"buy_links\": [\n" +
                "          {\n" +
                "            \"name\": \"Amazon\",\n" +
                "            \"url\": \"https://www.amazon.com/Bloody-Genius-Virgil-Flowers-Novel/dp/0525536612?tag=NYTBS-20\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"name\": \"Apple Books\",\n" +
                "            \"url\": \"http://du-gae-books-dot-nyt-du-prd.appspot.com/buy?title=BLOODY+GENIUS&author=John+Sandford\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"name\": \"Barnes and Noble\",\n" +
                "            \"url\": \"http://www.anrdoezrs.net/click-7990613-11819508?url=http%3A%2F%2Fwww.barnesandnoble.com%2Fw%2F%3Fean%3D9780525536611\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"name\": \"Local Booksellers\",\n" +
                "            \"url\": \"http://www.indiebound.org/book/9780525536611?aff=NYT\"\n" +
                "          }\n" +
                "        ],\n" +
                "        \"book_uri\": \"nyt://book/fea821b6-6392-50b8-b5ae-048621b34a82\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"rank\": 12,\n" +
                "        \"rank_last_week\": 7,\n" +
                "        \"weeks_on_list\": 3,\n" +
                "        \"asterisk\": 0,\n" +
                "        \"dagger\": 0,\n" +
                "        \"primary_isbn10\": \"1501190628\",\n" +
                "        \"primary_isbn13\": \"9781501190629\",\n" +
                "        \"publisher\": \"Emily Bestler/Atria\",\n" +
                "        \"description\": \"Mexican cartels, ISIS and a possible pandemic bring Mitch Rapp back into action.\",\n" +
                "        \"price\": 0,\n" +
                "        \"title\": \"VINCE FLYNN: LETHAL AGENT\",\n" +
                "        \"author\": \"Kyle Mills\",\n" +
                "        \"contributor\": \"by Kyle Mills\",\n" +
                "        \"contributor_note\": \"\",\n" +
                "        \"book_image\": \"https://s1.nyt.com/du/books/images/9781501190643.jpg\",\n" +
                "        \"book_image_width\": 326,\n" +
                "        \"book_image_height\": 495,\n" +
                "        \"amazon_product_url\": \"https://www.amazon.com/Lethal-Agent-Mitch-Rapp-Novel-ebook/dp/B07NBJSFFJ?tag=NYTBS-20\",\n" +
                "        \"age_group\": \"\",\n" +
                "        \"book_review_link\": \"\",\n" +
                "        \"first_chapter_link\": \"\",\n" +
                "        \"sunday_review_link\": \"\",\n" +
                "        \"article_chapter_link\": \"\",\n" +
                "        \"isbns\": [\n" +
                "          {\n" +
                "            \"isbn10\": \"1501190628\",\n" +
                "            \"isbn13\": \"9781501190629\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"isbn10\": \"1982140127\",\n" +
                "            \"isbn13\": \"9781982140120\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"isbn10\": \"1501190644\",\n" +
                "            \"isbn13\": \"9781501190643\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"isbn10\": \"1508287716\",\n" +
                "            \"isbn13\": \"9781508287711\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"isbn10\": \"1508287708\",\n" +
                "            \"isbn13\": \"9781508287704\"\n" +
                "          }\n" +
                "        ],\n" +
                "        \"buy_links\": [\n" +
                "          {\n" +
                "            \"name\": \"Amazon\",\n" +
                "            \"url\": \"https://www.amazon.com/Lethal-Agent-Mitch-Rapp-Novel-ebook/dp/B07NBJSFFJ?tag=NYTBS-20\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"name\": \"Apple Books\",\n" +
                "            \"url\": \"http://du-gae-books-dot-nyt-du-prd.appspot.com/buy?title=VINCE+FLYNN%3A+LETHAL+AGENT&author=Kyle+Mills\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"name\": \"Barnes and Noble\",\n" +
                "            \"url\": \"http://www.anrdoezrs.net/click-7990613-11819508?url=http%3A%2F%2Fwww.barnesandnoble.com%2Fw%2F%3Fean%3D9781501190629\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"name\": \"Local Booksellers\",\n" +
                "            \"url\": \"http://www.indiebound.org/book/9781501190629?aff=NYT\"\n" +
                "          }\n" +
                "        ],\n" +
                "        \"book_uri\": \"nyt://book/86e28126-9c5c-5a00-b21f-80352e72ca2d\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"rank\": 13,\n" +
                "        \"rank_last_week\": 8,\n" +
                "        \"weeks_on_list\": 2,\n" +
                "        \"asterisk\": 0,\n" +
                "        \"dagger\": 0,\n" +
                "        \"primary_isbn10\": \"1250265703\",\n" +
                "        \"primary_isbn13\": \"9781250265708\",\n" +
                "        \"publisher\": \"St. Martin's\",\n" +
                "        \"description\": \"A 16-year-old, who sleeps with a concentration camp commandant in order to survive, is sentenced to a Siberian prison camp where she cares for the ill.\",\n" +
                "        \"price\": 0,\n" +
                "        \"title\": \"CILKA'S JOURNEY\",\n" +
                "        \"author\": \"Heather Morris\",\n" +
                "        \"contributor\": \"by Heather Morris\",\n" +
                "        \"contributor_note\": \"\",\n" +
                "        \"book_image\": \"https://s1.nyt.com/du/books/images/9781250265708.jpg\",\n" +
                "        \"book_image_width\": 326,\n" +
                "        \"book_image_height\": 495,\n" +
                "        \"amazon_product_url\": \"https://www.amazon.com/Cilkas-Journey-Novel-Tattooist-Auschwitz/dp/1250265703?tag=NYTBS-20\",\n" +
                "        \"age_group\": \"\",\n" +
                "        \"book_review_link\": \"\",\n" +
                "        \"first_chapter_link\": \"\",\n" +
                "        \"sunday_review_link\": \"\",\n" +
                "        \"article_chapter_link\": \"\",\n" +
                "        \"isbns\": [\n" +
                "          {\n" +
                "            \"isbn10\": \"1250265703\",\n" +
                "            \"isbn13\": \"9781250265708\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"isbn10\": \"1250265797\",\n" +
                "            \"isbn13\": \"9781250265791\"\n" +
                "          }\n" +
                "        ],\n" +
                "        \"buy_links\": [\n" +
                "          {\n" +
                "            \"name\": \"Amazon\",\n" +
                "            \"url\": \"https://www.amazon.com/Cilkas-Journey-Novel-Tattooist-Auschwitz/dp/1250265703?tag=NYTBS-20\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"name\": \"Apple Books\",\n" +
                "            \"url\": \"http://du-gae-books-dot-nyt-du-prd.appspot.com/buy?title=CILKA%27S+JOURNEY&author=Heather+Morris\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"name\": \"Barnes and Noble\",\n" +
                "            \"url\": \"http://www.anrdoezrs.net/click-7990613-11819508?url=http%3A%2F%2Fwww.barnesandnoble.com%2Fw%2F%3Fean%3D9781250265708\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"name\": \"Local Booksellers\",\n" +
                "            \"url\": \"http://www.indiebound.org/book/9781250265708?aff=NYT\"\n" +
                "          }\n" +
                "        ],\n" +
                "        \"book_uri\": \"nyt://book/014cbbe5-9d31-59d6-9f09-dd39d04421a0\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"rank\": 14,\n" +
                "        \"rank_last_week\": 10,\n" +
                "        \"weeks_on_list\": 2,\n" +
                "        \"asterisk\": 0,\n" +
                "        \"dagger\": 0,\n" +
                "        \"primary_isbn10\": \"1538731339\",\n" +
                "        \"primary_isbn13\": \"9781538731338\",\n" +
                "        \"publisher\": \"Grand Central\",\n" +
                "        \"description\": \"After disappearing for six days, a boy emerges from the woods with a voice in his head that sends him on a mission.\",\n" +
                "        \"price\": 0,\n" +
                "        \"title\": \"IMAGINARY FRIEND\",\n" +
                "        \"author\": \"Stephen Chbosky\",\n" +
                "        \"contributor\": \"by Stephen Chbosky\",\n" +
                "        \"contributor_note\": \"\",\n" +
                "        \"book_image\": \"https://s1.nyt.com/du/books/images/9781538731338.jpg\",\n" +
                "        \"book_image_width\": 328,\n" +
                "        \"book_image_height\": 495,\n" +
                "        \"amazon_product_url\": \"https://www.amazon.com/Imaginary-Friend-Stephen-Chbosky/dp/1538731339?tag=NYTBS-20\",\n" +
                "        \"age_group\": \"\",\n" +
                "        \"book_review_link\": \"https://www.nytimes.com/2019/10/07/books/review/imaginary-friend-stephen-chbosky.html\",\n" +
                "        \"first_chapter_link\": \"\",\n" +
                "        \"sunday_review_link\": \"\",\n" +
                "        \"article_chapter_link\": \"\",\n" +
                "        \"isbns\": [\n" +
                "          {\n" +
                "            \"isbn10\": \"1538731339\",\n" +
                "            \"isbn13\": \"9781538731338\"\n" +
                "          }\n" +
                "        ],\n" +
                "        \"buy_links\": [\n" +
                "          {\n" +
                "            \"name\": \"Amazon\",\n" +
                "            \"url\": \"https://www.amazon.com/Imaginary-Friend-Stephen-Chbosky/dp/1538731339?tag=NYTBS-20\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"name\": \"Apple Books\",\n" +
                "            \"url\": \"http://du-gae-books-dot-nyt-du-prd.appspot.com/buy?title=IMAGINARY+FRIEND&author=Stephen+Chbosky\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"name\": \"Barnes and Noble\",\n" +
                "            \"url\": \"http://www.anrdoezrs.net/click-7990613-11819508?url=http%3A%2F%2Fwww.barnesandnoble.com%2Fw%2F%3Fean%3D9781538731338\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"name\": \"Local Booksellers\",\n" +
                "            \"url\": \"http://www.indiebound.org/book/9781538731338?aff=NYT\"\n" +
                "          }\n" +
                "        ],\n" +
                "        \"book_uri\": \"nyt://book/8458120f-fd20-5f6f-8c1d-3182a4a0d79e\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"rank\": 15,\n" +
                "        \"rank_last_week\": 13,\n" +
                "        \"weeks_on_list\": 6,\n" +
                "        \"asterisk\": 0,\n" +
                "        \"dagger\": 0,\n" +
                "        \"primary_isbn10\": \"1629996297\",\n" +
                "        \"primary_isbn13\": \"9781629996295\",\n" +
                "        \"publisher\": \"Front Line\",\n" +
                "        \"description\": \"A traveler discovers mysteries hidden behind seven locked doors.\",\n" +
                "        \"price\": 0,\n" +
                "        \"title\": \"THE ORACLE\",\n" +
                "        \"author\": \"Jonathan Cahn\",\n" +
                "        \"contributor\": \"by Jonathan Cahn\",\n" +
                "        \"contributor_note\": \"\",\n" +
                "        \"book_image\": \"https://s1.nyt.com/du/books/images/9781629996295.jpg\",\n" +
                "        \"book_image_width\": 330,\n" +
                "        \"book_image_height\": 488,\n" +
                "        \"amazon_product_url\": \"https://www.amazon.com/Oracle-Jubilean-Mysteries-Unveiled/dp/1629996297?tag=NYTBS-20\",\n" +
                "        \"age_group\": \"\",\n" +
                "        \"book_review_link\": \"\",\n" +
                "        \"first_chapter_link\": \"\",\n" +
                "        \"sunday_review_link\": \"\",\n" +
                "        \"article_chapter_link\": \"\",\n" +
                "        \"isbns\": [\n" +
                "          {\n" +
                "            \"isbn10\": \"1629996297\",\n" +
                "            \"isbn13\": \"9781629996295\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"isbn10\": \"1629996300\",\n" +
                "            \"isbn13\": \"9781629996301\"\n" +
                "          }\n" +
                "        ],\n" +
                "        \"buy_links\": [\n" +
                "          {\n" +
                "            \"name\": \"Amazon\",\n" +
                "            \"url\": \"https://www.amazon.com/Oracle-Jubilean-Mysteries-Unveiled/dp/1629996297?tag=NYTBS-20\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"name\": \"Apple Books\",\n" +
                "            \"url\": \"http://du-gae-books-dot-nyt-du-prd.appspot.com/buy?title=THE+ORACLE&author=Jonathan+Cahn\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"name\": \"Barnes and Noble\",\n" +
                "            \"url\": \"http://www.anrdoezrs.net/click-7990613-11819508?url=http%3A%2F%2Fwww.barnesandnoble.com%2Fw%2F%3Fean%3D9781629996295\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"name\": \"Local Booksellers\",\n" +
                "            \"url\": \"http://www.indiebound.org/book/9781629996295?aff=NYT\"\n" +
                "          }\n" +
                "        ],\n" +
                "        \"book_uri\": \"nyt://book/94a69adb-1890-5c29-980d-daea1072a316\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"corrections\": []\n" +
                "  }\n" +
                "}";
    }
}