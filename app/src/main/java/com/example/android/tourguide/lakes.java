package com.example.android.tourguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class lakes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lakes);

        final ArrayList<listItem> listk = new ArrayList<listItem>();
        listk.add(new listItem("1.", "Nainital Lake", R.drawable.nainital, "Nainital Lake, a natural freshwater body, situated amidst the township of Nainital in Uttarakhand State of India, tectonic in origin, is kidney shaped or crescent shaped and has an outfall at the southeastern end."
                + "Nainital is most popular hill station of Kumaon district. It is famous for its Naini Lake located at the centre of the town and several other lakes of nearby areas."
                + "Nainital Lake, in the Nainital district called the Lake District of India, is one of the four Lakes of Kumaon hills; the other three lakes are the Sattal Lake, the Bhimtal Lake and the Naukuchiyatal Lake.[3]", 29.387145, 79.4549889));
        listk.add(new listItem("2.", "Hemkund", R.drawable.hemkund, "Hemkund Sahib (also spelled Hemkunt), formally known as Gurudwara Sri Hemkund Sahib Ji, is a Sikh place of worship and pilgrimage site in Chamoli district, Uttarakhand, India. It is devoted to Guru Gobind Singh (1666–1708), the tenth Sikh Guru, and finds mention in Dasam Granth, a work dictated by Guruji himself. With its setting of a glacial lake surrounded by seven mountain peaks, each adorned by a Nishan Sahib on its cliff, it is according to the Survey of India located in the Himalayas at an elevation of 4,632 meters (15,197 feet).[1] It is approached from Gobindghat on the Rishikesh-Badrinath highway. The main town near Gobindghat is Joshimath.", 30.700999, 79.613253));
        listk.add(new listItem("3.", "RoopKund", R.drawable.roopkund, "Roopkund (locally known as Mystery and Skeletons Lake)[1] is a high altitude glacial lake in the Uttarakhand state of India. It lies in the lap of Trishul massif and is famous for the hundreds of human skeletons found at the edge of the lake. The area is uninhabited, in the Himalayas at an altitude of 5,029 metres (16,499 feet).[1] Surrounded by rock-strewn glaciers and snow-clad mountains, the lake is a popular trekking destination.[2]" +
                "The Roopkund Lake in August 2014" +
                "A shallow lake, having a depth of about two metres, Roopkund has attracted attention because of the human skeletal remains that are visible at its bottom when the snow melts.[3] Researchers have concluded that the skeletons are the remains of people killed in a sudden, violent hailstorm in the 9th century.[4] Because of the human remains, the lake has been called Skeleton Lake in recent times.", 30.262205, 79.731455));
        listk.add(new listItem("4.", "Deoria Tal", R.drawable.deoriatal, "Deoria Tal (Also spelled as Devaria' or 'Deoriya) is a lake located about 3 km on an uphill trek from the villages of Mastura and Sari, on the Ukhimath-Chopta road in Uttarakhand. At an altitude of about 2438 meters, it has heavily wooded, lush green surroundings with snow-covered mountains (Chaukhamba is one of them) in the backdrop.The lake is known for its wide 300° panorama. Mountains like Chaukhamba, Nilkantha, Bandarpunch, Kedar Range, Kalanag, etc. can be viewed from here. There exists another route from Deoria Tal to Tungnath, which is mainly chosen as Night Camping, Jungle Trekking, etc.", 30.522119, 79.127565));
        listk.add(new listItem("5.", "Pindari Glacier", R.drawable.pindariglacier, "The Pindari Glacier is a glacier found in the upper reaches of the Kumaon Himalayas, to the southeast of Nanda Devi, Nanda Kot. The glacier flows to the south for a short distance of about 3 km (1.9 mi),0.25 km in breadth and gives rise to the Pindari River which meets the Alakananda at Karnaprayag in the Garhwal district." +
                "Pindari and Kafni glacier trek Route Map" +
                "The trail to reach the glacier crosses the villages of Saung, Loharkhet, crosses over the Dhakuri Pass, continues onto Khati village (the last inhabited village on the trail), Dwali, Phurkia and finally Zero Point, Pindar, the end of the trail. Though most of the trail is along the banks of the Pindari River, the river is mostly hidden until after Khati.", 30.290665, 79.988217));
        listk.add(new listItem("6.", "Gangotri Glacier", R.drawable.gangotriglacier, "Gangotri Glacier (Sanskrit, Nepali and Hindi: गंगोत्री) is located in Uttarkashi District, Uttarakhand, India in a region bordering China. This glacier, one of the primary sources of the Ganges, is one of the largest in the Himalayas with an estimated volume of over 27 cubic kilometers.[1] The glacier is about 30 kilometres (19 miles) long and 2 to 4 km (1 to 2 mi) wide. Around the glacier are the peaks of the Gangotri Group, including several peaks notable for extremely challenging climbing routes, such as Shivling, Thalay Sagar, Meru, and Bhagirathi III. It flows roughly northwest, originating in a cirque below Chaukhamba, the highest peak of the group." +
                "The terminus of the Gangotri Glacier is said to resemble a cow's mouth, and the place is called Gomukh or Gaumukh (gou, cow + mukh, face). Gomukh, which is about 19 km (11.8 mi) from the town of Gangotri, is the precise source of the Bhagirathi river, an important tributary of the Ganges. Gomukh is situated near the base of Shivling; in between lies the Tapovan meadow.", 30.970639, 78.988217));


        listAdapter ld = new listAdapter(lakes.this, listk);
        ListView listView = (ListView) findViewById(R.id.lakes);
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
                Intent i = new Intent(lakes.this, Particular.class);
                i.putExtra("placeName", pn);
                i.putExtra("placeInfo", pi);
                i.putExtra("placePic", pp);
                i.putExtra("placeD1", d1);
                i.putExtra("placeD2", d2);
                startActivity(i);
            }
        });

    }
}
