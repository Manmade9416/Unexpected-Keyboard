package juloo.keyboard2.dict;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import juloo.keyboard2.Config;
import juloo.keyboard2.R;

public class DictionariesActivity extends Activity
{
  @Override
  public void onCreate(Bundle savedInstanceState)
  {
    SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
    setTheme(Config.getThemeId(getResources(), prefs.getString("theme", "")));
    super.onCreate(savedInstanceState);
    setContentView(R.layout.dictionaries_activity);
  }
}
