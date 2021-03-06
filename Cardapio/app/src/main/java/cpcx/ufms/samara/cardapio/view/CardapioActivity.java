package cpcx.ufms.samara.cardapio.view;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ListView;

import com.raizlabs.android.dbflow.sql.language.SQLite;

import java.util.List;

import butterknife.BindView;
import butterknife.OnClick;
import butterknife.OnItemClick;
import cpcx.ufms.samara.cardapio.R;
import cpcx.ufms.samara.cardapio.adapter.CardapioAdapter;
import cpcx.ufms.samara.cardapio.model.Comida;

public class CardapioActivity extends AppCompatActivity {
    @BindView(R.id.lvCardaPio)
    ListView lv;
    private List<Comida> comidas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cardapio);
    }

    @Override
    protected void onResume() {
        super.onResume();
        UpdateUi();
    }


    private void UpdateUi() {
        comidas = SQLite.select().from(Comida.class).queryList();
        CardapioAdapter adapter =
                new CardapioAdapter(comidas,
                        getBaseContext());
        lv.setAdapter(adapter);
    }

    @OnItemClick(R.id.lvCardaPio)
    public void onItem(int id) {
        Intent i = new Intent(getBaseContext(), tela2cardapio.class);
        Bundle b = new Bundle();
         b.putSerializable("lanche",comidas.get(id));

        i.putExtras(b);
        startActivity(i);
    }

    @OnClick(R.id.fab)
    public void add(View v){
        Comida c = new Comida();
        c.setNome("teste");
        c.setValor(Math.random()*20);
        c.setIngredientes("DASZXCVBNM<MCZCVDFGDFGDF");
        c.save();
        UpdateUi();
    }
}