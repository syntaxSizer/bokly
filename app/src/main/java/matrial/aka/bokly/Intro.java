package matrial.aka.bokly;

import com.stephentuso.welcome.WelcomeScreenBuilder;
import com.stephentuso.welcome.ui.WelcomeActivity;
import com.stephentuso.welcome.util.WelcomeScreenConfiguration;

/**
 * Created by geckozila on 15/06/16.
 */
public class Intro extends WelcomeActivity{

    @Override
    protected WelcomeScreenConfiguration configuration() {
        return new WelcomeScreenBuilder(this)
                .theme(R.style.WelcomeScreenTheme_Light)
                .defaultBackgroundColor(R.color.background)
                .titlePage(R.drawable.logo_renaud, "Title")
                .basicPage(R.drawable.logo_cafefrida, "Header", "More text.", R.color.red)
                .basicPage(R.drawable.logo_mariana, "Lorem ipsum", "dolor sit amet.")
                .swipeToDismiss(true)
                .swipeToDismiss(true)
                .exitAnimation(android.R.anim.fade_out)
                .build();
    }
    public static String welcomekey(){
        return "Welcome screen";
    }
}