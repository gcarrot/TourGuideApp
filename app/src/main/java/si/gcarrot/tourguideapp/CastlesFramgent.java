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

public class CastlesFramgent extends Fragment {

    public CastlesFramgent() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.item_list, container, false);

        final ArrayList<Item> items = new ArrayList<Item>();
        items.add(new Item(R.string.castle_krumperk, R.string.castle_krumperk_location, R.drawable.krumperk));
        items.add(new Item(R.string.castle_crnelo, R.string.castle_crnelo_location, R.drawable.crnelo));
        items.add(new Item(R.string.castle_cesenik, R.string.castle_cesenik_location, R.drawable.cesenik));

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
