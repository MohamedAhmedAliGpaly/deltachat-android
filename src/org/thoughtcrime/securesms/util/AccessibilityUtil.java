package org.thoughtcrime.securesms.util;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.util.Log;

public final class AccessibilityUtil {

  private AccessibilityUtil() {
  }

  public static boolean areAnimationsDisabled(Context context) {
    if (context == null) {
      Log.e("AccessibilityUtil", "animationsDisabled: context was null");
      return false;
    }
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1) {
      return Settings.Global.getFloat(context.getContentResolver(), Settings.Global.ANIMATOR_DURATION_SCALE, 1) == 0f;
    } else {
      return false;
    }
  }
}
