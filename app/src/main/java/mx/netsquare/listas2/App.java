package mx.netsquare.listas2;

import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class App extends ListActivity {


    private ArrayList<String> valores;
    private ListView lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.app);

        valores = new ArrayList<>();
        valores.add("IOS");
        valores.add("Android");
        valores.add("Mac OS X");
        valores.add("Linux");
        valores.add("WebOs");
        valores.add("Symbian");
        valores.add("Blackberry");
        ArrayAdapter<String> adaptador;
        adaptador = new ArrayAdapter<String>(this,
                R.layout.renglon,
                R.id.txtTexto,
                valores);

        lista.setTextFilterEnabled(true);
        lista = getListView();
        setListAdapter(adaptador);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        String tex = (String)getListView().getItemAtPosition(position).toString();
        Toast.makeText(this, "Selecciono: " + tex, Toast.LENGTH_SHORT).show();
    }
}

