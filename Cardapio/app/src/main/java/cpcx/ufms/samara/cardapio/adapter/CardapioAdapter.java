package cpcx.ufms.samara.cardapio.adapter;


import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import cpcx.ufms.samara.cardapio.R;
import cpcx.ufms.samara.cardapio.model.Comida;

/**
 * Created by samy on 18/09/2016.
 */
public class CardapioAdapter extends BaseAdapter {
    private LayoutInflater layoutInflater;
    private List<Comida> comidas;

    public CardapioAdapter(List<Comida> itens, Context context) {
        this.comidas = itens;
        layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return comidas.size();
    }

    @Override
    public Object getItem(int i) {
        return comidas.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        Comida comida = comidas.get(i);

        ViewHolder holder;

        if (view != null) {
            holder = (ViewHolder) view.getTag();
        } else {
            view = layoutInflater.inflate(R.layout.item,
                    viewGroup, false);
            holder = new ViewHolder(view);
            view.setTag(holder);
        }


        holder.tvNome.setText(comida.getNome());


        holder.tvValor.setText("R$: " + comida.getValor());

        if (comida.getValor() >= 10) {
            holder.tvValor.setTextColor(
                    ContextCompat.getColor(view.getContext(),
                            R.color.colorText)
            );
        }


        return view;
    }

    static class ViewHolder {
        @BindView(R.id.tvNome)
        TextView tvNome;

        @BindView(R.id.tvpreco)
        TextView tvValor;

        @BindView(R.id.imagem)
        ImageView img;

        public ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }


}
