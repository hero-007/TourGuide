package com.example.android.tourguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class educational_sites extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lakes);

        final ArrayList<listItem> listk = new ArrayList<listItem>();
        listk.add(new listItem("1.","Jim Corbett National Park",R.drawable.jim,"Jim Corbett National Park is the oldest national park in India and was established in 1936 as Hailey National Park to protect the endangered Bengal tiger. It is located in Nainital district of Uttarakhand and was named after Jim Corbett who played a key role in its establishment. The park was the first to come under the Project Tiger initiative.",29.530356,78.774635));
        listk.add(new listItem("2.","Valley Of Flowers National Park",R.drawable.valleyofflowers,"Valley of Flowers National Park is an Indian national park, located in West Himalaya, in the state of Uttarakhand and is known for its meadows of endemic alpine flowers and the variety of flora. This richly diverse area is also home to rare and endangered animals, including the Asiatic black bear,[1] snow leopard,[1] musk deer,[1] brown bear, red fox,[1] and blue sheep. Birds found in the park include Himalayan monal pheasant and other high altitude birds.[2] At 3352 to 3658 meters above sea level, the gentle landscape of the Valley of Flowers National Park complements the rugged mountain wilderness of Nanda Devi National Park to the east.[3] Together, they encompass a unique transition zone between the mountain ranges of the Zanskar and Great Himalaya. The park stretches over an expanse of 87.50 km2 and it is about 8 km long and 2 km wide.[2] Both parks are encompassed in the Nanda Devi Biosphere Reserve (223,674 ha) which is further surrounded by a buffer zone (5,148.57 km2).[4] This Reserve is in the UNESCO World Network of Biosphere Reserves since 2004.",30.728022,79.605464));
        listk.add(new listItem("3.","Binsar Wildlife Sanctuary",R.drawable.binsar,"Binsar Wildlife Sanctuary is located in the Himalayas on top of the Jhandi Dhar hills. It is about 33 km north of the Almora town in Uttarakhand, India."+
                "From a place called Zero Point in Binsar one can see the Himalayan peaks like Kedarnath Peak, Shivling, Trisul and Nanda Devi."+
                "Binsar was the summer capital of the Chand Kings, who ruled over Kumaon from the 11th to 18th centuries AD. Binsar was established in 1988 for the conservation and protection of the shrinking broad leaf oak (Quercus) forests of the Central Himalayan region, and it has over 200 bird species. The sanctuary is spread over 45.59 km2 and situated at an altitude varying from 900 to 2500 metres with an average height of 2412 metres. It is located 35 km from Almora in the state of Uttarakhand.",29.704469,79.757572));
        listk.add(new listItem("4.","Rajaji National Park",R.drawable.rajaji,"Rajaji National Park is an Indian national park and tiger reserve[1] that encompasses the Shivaliks, near the foothills of the Himalayas. The park is spread over 820 km2.,[2] and three districts of Uttarakhand: Haridwar, Dehradun and Pauri Garhwal. In 1983, three wildlife sanctuaries in the area namely, Chilla, Motichur and Rajaji sanctuaries were merged into one."+
                "Rajaji National Park has been named after C. Rajagopalachari (Rajaji), a prominent leader of the Freedom Struggle, the second and last Governor-General of independent India and one of the first recipients of India's highest civilian award Bharat Ratna (in 1954). Final approval was accorded to Kudremukh (Karnataka) and Rajaji (Uttarakhand) for declaring as a tiger reserve in 15 April 2015.[3] Rajaji became the second tiger reserve in Uttarakhand.",29.991974,78.289546));
        listk.add(new listItem("5.","Pt. G.B.Pant High Altitude Zoo",R.drawable.highaltitudezoo,"Pt. G.B. Pant High Altitude Zoo is a high altitude zoo situated in Nainital, Uttarakhand. Established in 1984 and opened to public in 1995, it is situated on the Sher Ka Danda hill at a height of 2,100 metres (6,900 ft) above sea-level and is spread over 4.6 hectares (11 acres). It is the only High Altitude Zoo in north India, besides those in Darjeeling and Sikkim. Over the years it has become a popular tourist attraction.The zoo was established in 1984, though it was opened to visitors on June 1, 1995."+
                "The Naintal Zoo was home to India's only Siberian tiger from 2001 until its death in November 2011. The tiger, named Kunal, was half of a pair of tigers brought from Darjeeling in 1997. His older brother, named Mahesh, died in 2001.",29.380719,79.468684));
        listk.add(new listItem("6.","Tehri Dam",R.drawable.tehridam,"The Tehri Dam is the Highest dam in India and one of the highest in the world. It is a multi-purpose rock and earth-fill embankment dam on the Bhagirathi River near Tehri in Uttarakhand, India. It is the primary dam of the THDC India Ltd. and the Tehri hydroelectric complex. Phase 1 was completed in 2006, the Tehri Dam withholds a reservoir for irrigation, municipal water supply and the generation of 1,000 megawatts (1,300,000 hp) of hydroelectricity. The dam's 1,000  MW pumped-storage scheme is currently under construction with expected commissioning in May 2018. A preliminary investigation for the Tehri Dam Project was completed in 1961 and its design was completed in 1972 with a 600 MW capacity power plant based on the study. Construction began in 1978 after feasibility studies but was delayed due to financial, environmental and social impacts. In 1986, technical and financial assistance was provided by the USSR but this was interrupted years later with political instability. Construction of the Tehri Dam was complete in 2006 while the second part of the project, the Koteshwar Dam was completed in 2012.",30.377395,78.479501));
        listk.add(new listItem("7.","Asan Barrage",R.drawable.asanbarrage,"The Asan Barrage is a barrage in the Uttarakhand-Himachal Pradesh border region in Doon Valley, (Dehradun District), northern India, situated at the confluence of the Eastern Yamuna Canal and the Asan River and about 11 km (7 mi) from Dakpathar, and 28 km. northwest of Dehradun. Directly behind the barrage on its eastern flank, water reenters the Eastern Yamuna Canal on the west side of the Yamuna River. At a distance of 4.5 km (3 mi) from the barrage on the canal, water reaches the 30 MW Kulhal Power Plant at 30°25′43″N 77°37′46″E. The power plant contains three 10 MW Kaplan turbine-generators and has a design hydraulic head of 18 m (59 ft).[1] Once discharged from the power station, the water is conducted by the canal 13 km (8 mi) to the 72 MW Khara Power Station at 30°21′02″N 77°36′06″E in Uttar Pradesh. The Khara Power Station contains three 24 MW Francis turbine-generators and a has a net head of 43 m (141 ft). The dam creates the Asan Reservoir, also called Dhalipur Lake. The lake is popular for bird watching and 53 species are known to make a habitat there, 19 species are migratory from Eurasia.",30.435925,77.665556));
        listk.add(new listItem("8.","Deer Park",R.drawable.deerpark,"Now known as the Dehradun Zoo. Under some construction with significant upgrades in progress. It is new but there are many types of animals & birds there is also a park cum garden. The place has a variety of animals to see. Apart from the number of deers, it houses a vast variety of birds. Good place to be for the nature lovers. The attraction is that the whole place is like a park and there is plenty of space for a family to relax. One corner is an adventure park with activities for youngsters and children. There are restaurants for cool stuff, tea and snacks.",30.390150,78.075209));

        listAdapter ld = new listAdapter(educational_sites.this, listk);
        ListView listView = (ListView)findViewById(R.id.lakes);
        listView.setAdapter(ld);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                listItem etc = listk.get(position);
                String pn = etc.getPlaceName();
                String pi = etc.getPlaceInfo();
                int pp = etc.getPlacePic();
                double d1 = etc.getD1();
                double d2 = etc.getD2();
                Intent i = new Intent(educational_sites.this, Particular.class);
                i.putExtra("placeName", pn);
                i.putExtra("placeInfo", pi);
                i.putExtra("placePic", pp);
                i.putExtra("placeD1",d1);
                i.putExtra("placeD2",d2);
                startActivity(i);
            }
        });

    }
}
