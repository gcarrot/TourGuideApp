package si.gcarrot.tourguideapp;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Urban on 6/29/17.
 */

public class ResturantsFragment extends Fragment {

    public ResturantsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.item_list, container, false);

        final ArrayList<Item> items = new ArrayList<Item>();
        items.add(new Item(R.string.resturatn_park, R.string.resturatn_park_location, R.drawable.park));
        items.add(new Item(R.string.resturant_zajc, R.string.resturant_zajc_location, R.drawable.zajc));
        items.add(new Item(R.string.resturant_pristan, R.string.resturant_pristan_location, R.drawable.pristan));
        items.add(new Item(R.string.resturant_adam, R.string.resturant_adam_location, R.drawable.adam));

        ItemAdapter adapter = new ItemAdapter(getActivity(), items);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Log.i("Urban", "test");
            }
        });

        return rootView;
    }

}
