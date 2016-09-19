package cpcx.ufms.samara.cardapio.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import cpcx.ufms.samara.cardapio.model.Comida;
import cpcx.ufms.samara.cardapio.R;

public class tela2cardapio extends AppCompatActivity {
    Intent i;
    Comida c;
    @BindView(R.id.tvNomedoLanche)
     TextView lanches;
    @BindView(R.id.tvIngredientes)
     TextView ingred;
    @BindView(R.id.tvPreco)
      TextView preco;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2cardapio);
        ButterKnife.bind(this);

        i=getIntent();
        Bundle b = i.getExtras();
        if(b!=null){
            c = (Comida)b.getSerializable("lanche");
            ingred.setText(c.getNome());
            preco.setText(String.valueOf(c.getValor()));
        }

    }
}
