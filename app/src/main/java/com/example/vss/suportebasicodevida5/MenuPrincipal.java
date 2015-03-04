package com.example.vss.suportebasicodevida5;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by a47503 on 04-03-2015.
 */
public class MenuPrincipal extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.activity_main, container, false);
    }

    //Método para saltar para outra activity
    public void onCLickChange2Activity(View b) {
        switch (((Button) b).getText().toString()) {
            case "112":
                //Método que pertence à classe super
                //startActivityForResult(new Intent(b.getContext(), RelativeLayout.class), 0);
                break;

            case "SBV":
                //Método que pertence à classe super
                startActivityForResult(new Intent(b.getContext(), sbv_verificar_estado_de_consciencia.class), 0);
                break;

            case "Engasgamento":
                //Método que pertence à classe super
                startActivityForResult(new Intent(b.getContext(), eng_pedir_para_tossir.class), 0);
                break;

            default:
                //Caixa de mensagem do tipo alert
                AlertDialog msgBox = new AlertDialog.Builder(b.getContext()).create();
                msgBox.setTitle("ATENÇÂO");
                msgBox.setMessage("A activity: " + ((Button) b).getText().toString() + " Não existe");
                msgBox.show();
                break;
        }
    }
}
