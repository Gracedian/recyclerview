package com.test.bahasapemrograman;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvCategory;
    private ArrayList<Pemrograman> list = new ArrayList<>();
    private String title = "Mode List";
    final String STATE_TITLE = "state_string";
    final String STATE_LIST = "state_list";
    final String STATE_MODE = "state_mode";
    int mode;

    private void setActionBarTitle(String title) {
        getSupportActionBar().setTitle(title);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvCategory = findViewById(R.id.category);
        rvCategory.setHasFixedSize(true);

        list.addAll(PmgData.getListData());
        showRecyclerList();

        list = new ArrayList<>();

        if(savedInstanceState==null)
        {
            setActionBarTitle("Mode List");
            list.addAll(PmgData.getListData());
            showRecyclerList();
            mode = R.id.list;
        }
        else
        {
            String stateTitle = savedInstanceState.getString(STATE_TITLE);
            ArrayList<Pemrograman> stateList = savedInstanceState.getParcelableArrayList(STATE_LIST);
            int stateMode = savedInstanceState.getInt(STATE_MODE);
            setActionBarTitle(stateTitle);
            list.addAll(stateList);
            setMode(stateMode);
        }
    }

    private void showselectedbahasa(Pemrograman program) {
        //Toast.makeText(this, "Kamu mengklik " + program.getJudul(), Toast.LENGTH_SHORT).show();
        Intent moveWithDataIntent = new Intent(MainActivity.this, MovePage.class);
        moveWithDataIntent.putExtra(MovePage.pics, program.getFoto());
        moveWithDataIntent.putExtra(MovePage.names, program.getJudul());
        moveWithDataIntent.putExtra(MovePage.descs, program.getDesc());
        startActivity(moveWithDataIntent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    public void setMode(int selectedMode){
        String title = null;
        switch (selectedMode) {
            case R.id.list:
                title="Mode List";
                showRecyclerList();
                break;

            case R.id.grid:
                title = "Mode Grid";
                showRecyclerGrid();
                break;

            case R.id.cardview:
                title = "Mode Card View";
                showRecyclerCardView();
                break;
        }
        mode = selectedMode;
        setActionBarTitle(title);
    }

    private void showRecyclerList() {
        rvCategory.setLayoutManager(new LinearLayoutManager(this));
        ListPmgAdapter listPmgAdapter = new ListPmgAdapter(this);
        listPmgAdapter.setListpmg(list);
        rvCategory.setAdapter(listPmgAdapter);

        ItemClickSupport.addTo(rvCategory).setOnItemClickListener(new ItemClickSupport.OnItemClickListener() {
            @Override
            public void onItemClicked(RecyclerView recyclerView, int position, View v) {
                showselectedbahasa(list.get(position));
            }
        });
    }

    private void showRecyclerGrid() {
        rvCategory.setLayoutManager(new GridLayoutManager(this, 2));
        GridPmgAdapter gridPmgAdapter = new GridPmgAdapter(this);
        gridPmgAdapter.setListpmg(list);
        rvCategory.setAdapter(gridPmgAdapter);

        ItemClickSupport.addTo(rvCategory).setOnItemClickListener(new ItemClickSupport.OnItemClickListener() {
            @Override
            public void onItemClicked(RecyclerView recyclerView, int position, View v) {
                showselectedbahasa(list.get(position));
            }
        });
    }

    private void showRecyclerCardView() {
        rvCategory.setLayoutManager(new LinearLayoutManager(this));
        CardPmgAdapter cardPmgAdapter = new CardPmgAdapter(this);
        cardPmgAdapter.setListpmg(list);
        rvCategory.setAdapter(cardPmgAdapter);
    }

    @Override
    protected  void onSaveInstanceState(Bundle outState){
        super.onSaveInstanceState(outState);
        outState.putString(STATE_TITLE, getSupportActionBar().getTitle().toString());
        outState.putParcelableArrayList(STATE_LIST, list);
        outState.putInt(STATE_MODE, mode);
    }
}
