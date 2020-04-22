package br.com.pauloc.compras;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.ColorSpace;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{

    private ViewHolder mViewH = new ViewHolder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final CheckBox chb_frango = findViewById(R.id.chb_frango);
        final CheckBox chb_feijao = findViewById(R.id.chb_feijao);
        final CheckBox chb_arroz = findViewById(R.id.chb_arroz);
        final CheckBox chb_coca = findViewById(R.id.chb_coca);
        final CheckBox chb_choc = findViewById(R.id.chb_choc);
        final TextView text_total = findViewById(R.id.text_total);
        Button btn_soma = findViewById(R.id.btn_soma);
        btn_soma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double total = 0;

                if (chb_arroz.isChecked()) {
                    total += 17.25;
                }
                if (chb_feijao.isChecked()) {
                    total += 8.54;
                }
                if (chb_frango.isChecked()) {
                    total += 12.89;
                }
                if (chb_coca.isChecked()) {
                    total += 7.00;
                }
                if (chb_choc.isChecked()) {
                    total += 5.00;
                }
                text_total.setText("R$ " + Double.toString(total));
                if (total > 50.00) {
                    text_total.setTextColor(Color.RED);
                } else {
                    text_total.setTextColor(Color.GREEN);
                }
            }
                });
        }


            private static class ViewHolder{
        Button btn_soma;
        CheckBox chb_frango, chb_arroz, chb_feijao, chb_coca, chb_choc;
        TextView text_total;
    }

}
