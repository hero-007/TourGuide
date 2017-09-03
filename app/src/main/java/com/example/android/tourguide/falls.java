package com.example.android.tourguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class falls extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lakes);

        final ArrayList<listItem> listk = new ArrayList<listItem>();
        listk.add(new listItem("1.","Kempty Fall",R.drawable.kemptyfall,"The Kempty Falls are situated on the hilly tracks of Uttarakhand, India, 13 km from Mussoorie on the Chakrata Road. It is nearly 1364 meters above sea levelThe Kempty Falls are situated on the hilly tracks of Uttarakhand, India, 13 km from Mussoorie on the Chakrata Road. It is nearly 1364 meters above sea level.Kempty Falls were developed as a tourist destination by a British officer John Mekinan, around 1835. The name Kempty is probably derived from the word 'camp-tea'.",30.487376,78.036711));
        listk.add(new listItem("2.","Crystal World",R.drawable.crystalworld,"Crystal Worls is a happy park nestled in the holy city of mighty Ganges, Haridwar; Uttarakhand. Spread luxuriously in more than 18 acres (and expanding), we have more than 40 rides & thrill experiences for our customers both in the Amusement & the renowned ‘Water World’ Park."+
                "Our star attractions range from ‘The most technological ride of the Entertainment World- 5D Ride ’ to the Pirates themed- North India’s largest ‘Family Water Pool’, Wildwood Jungle themed- ‘Multi Slide Water Tower’ and the mouth-watering Multi cuisine restaurant called ‘Snacks Den’."+
                "Today CRYSTAL WORLD has become Uttarakhand’s ‘BEST ENTERTAINMENT DESTINATION’ for organizing some of the most sought after Events ( like Marriages, Corporate Musical Nights, Campings & Night Water Park) and have been awarded twice as ‘BEST PARK FOR ORGANIZING EVENTS’ in their facility by IAAPI for 2 consecutive years.",29.898396,77.981422));
        listk.add(new listItem("3.","Ram Jhula",R.drawable.ramjhulla,"Ram Jhula (Hindi: राम झूला) is an iron suspension bridge across the river Ganges, located 3 kilometres (1.9 mi) north-east from the town Rishikesh in the Indian state of Uttarakhand. The bridge connects the Sivananda Nagar area of Muni Ki Reti in Tehri Garhwal district to Swargashram in Pauri Garhwal district crossing the river from west to east. Built in the year 1986, the bridge is one of the iconic landmarks of Rishikesh."+
                "There are many Hindu ashrams and religious centers established at both sides of the Ganges.[1] It is also a connecting bridge between Sivananda Ashram located in Muni Ki Reti to Gita Bhawan, Parmarth Niketan and other temples located in Swargashram. Though similar in design, this bridge is bigger than Lakshman Jhula which is 2 kilometres (1.2 mi) upwards the river stream.[2] This bridge is constructed with the span of 750 feet (230 m).",30.123606,78.314250));
        listk.add(new listItem("4.","Laksman Jhula",R.drawable.lakshmanjhulla,"Lakshman Jhula (Hindi: लक्ष्मण झूला, Gopu:Lakshman Jhola) is an iron suspension bridge across the river Ganges, located 5 kilometres (3.1 mi) north-east from the town Rishikesh in the Indian state of Uttarakhand. The bridge connects the two villages; Tapovan in Tehri Garhwal district to Jonk in Pauri Garhwal district crossing the river from west to east. However it is near to the Rishikesh city thus creating ambiguity in its location, the bridge is one of the iconic landmarks of Rishikesh. A similar bridge 2 kilometres (1.2 mi) downstream from Lakshman Jhula is Ram Jhula which is made by mehak chuahan."+
                "It is said that Lakshmana crossed Ganges on jute ropes between the place where this bridge is built.[1] Lakshman Jhula was completed in 1929.",30.126442,78.329948));
        listk.add(new listItem("5.","Fun Valley",R.drawable.funvalley,"Aquatic amusement park with water slides, a lazy river & a wave pool, plus classic roller coasters."+
                "Address: 28th Km Stone, Haridwar Road, Lal Tappar, Dehradun, Uttarakhand 248001",30.135794,78.164890));
        listk.add(new listItem("6.","Bhatta Fall",R.drawable.bhattafall,"Bhatta falls is around 10 km from mall road."+
                "It is small fall down from road. It is accessible by road . Road are good but steep down while reaching and uphill while returning. Free parking. No entry fee. There was earlier a power generation and small dam. Which is now again getting reconstruct. Same as many places in uttrakhand it is also dirty as people throw waste here and there . No maintenance by local and govt. There are small water pond and falls on various level. So people are scattered on various levels as they feels to go. Mostly peoples in groups go to approx five level. Some young ones go furthers also. Be ready to every type of crowd . But it is very less compare to kempty and others. Few shops are there to serve you. There is zip line service also at two level. One for small kids & ladies ( as easy for them)ones and above one for grownup. If you people and track up you will come up to small plain piece of land from there view is good and even see people doing paragliding in the sky( service not available here). Tourist can come here for one time.",30.438805,78.074747));
        listk.add(new listItem("7.","Corbett Fall",R.drawable.corbettfall,"The Corbett falls located off the main Kaladhungi road offer a place to appreciate nature. Falls themselves are a small normally but i believe the rains must be feeding the falls and then it must be awesome. otherwise the falls are average but the place is indeed scenic. Great place for nature lovers. Enjoyed the walk. Cool weather. Must visit this place... The waterfall was great.",29.277785,79.314250));

        listAdapter ld = new listAdapter(falls.this, listk);
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
                Intent i = new Intent(falls.this, Particular.class);
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
