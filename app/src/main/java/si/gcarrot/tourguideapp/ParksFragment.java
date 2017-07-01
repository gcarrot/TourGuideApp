package si.gcarrot.tourguideapp;

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
 * Created by Urban on 7/1/17.
 */

public class ParksFragment extends Fragment {

    public ParksFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.item_list, container, false);

        final ArrayList<Item> items = new ArrayList<Item>();
        items.add(new Item(R.string.park_cesminov, R.string.park_cesminov_location));
        items.add(new Item(R.string.park_obcinski, R.string.park_obcinski_location));
        items.add(new Item(R.string.park_88lip, R.string.park_88lip_location));
        items.add(new Item(R.string.park_sumberk, R.string.park_sumberk_location));

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
