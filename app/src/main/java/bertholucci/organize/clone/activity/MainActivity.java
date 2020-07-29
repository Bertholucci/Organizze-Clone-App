package bertholucci.organize.clone.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.heinrichreimersoftware.materialintro.app.IntroActivity;
import com.heinrichreimersoftware.materialintro.slide.FragmentSlide;
import com.heinrichreimersoftware.materialintro.slide.SimpleSlide;

import bertholucci.organize.clone.R;
import bertholucci.organize.clone.activity.CadastroActivity;
import bertholucci.organize.clone.activity.LoginActivity;

public class MainActivity extends IntroActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        /* Not necessary because the IntroActivity statement
            setContentView(R.layout.activity_main);
         */

        setButtonBackVisible(false);
        setButtonNextVisible(false);

        addSlide(new FragmentSlide.Builder()
            .background(android.R.color.white)
                .fragment(R.layout.intro_1)
                .canGoBackward(false)
                .build()
        );

        addSlide(new FragmentSlide.Builder()
                .background(android.R.color.white)
                .fragment(R.layout.intro_2)
                .build()
        );

        addSlide(new FragmentSlide.Builder()
                .background(android.R.color.white)
                .fragment(R.layout.intro_3)
                .build()
        );

        addSlide(new FragmentSlide.Builder()
                .background(android.R.color.white)
                .fragment(R.layout.intro_4)
                .build()
        );

        addSlide(new FragmentSlide.Builder()
                .background(android.R.color.white)
                .fragment(R.layout.intro_5_cad)
                .canGoForward(false)
                .build()
        );
    }

    public void botaoEntrar(View view){
        startActivity(new Intent(this, LoginActivity.class));
    }

    public void botaoCadastrar(View view){
        startActivity(new Intent(this, CadastroActivity.class));
    }
}