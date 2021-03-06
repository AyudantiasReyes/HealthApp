// Generated by view binder compiler. Do not edit!
package com.google.firebase.codelab.labelScannerUABC.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.firebase.codelab.labelScannerUABC.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityDataEntryBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final FloatingActionButton acceptButton;

  @NonNull
  public final EditText azucarEditText;

  @NonNull
  public final ImageButton backButton;

  @NonNull
  public final EditText caloriasEditText;

  @NonNull
  public final EditText carbsEditText;

  @NonNull
  public final EditText lipidosEditText;

  @NonNull
  public final EditText nombreEditText;

  @NonNull
  public final TextView nombreTitle;

  @NonNull
  public final TextView nombreTitle10;

  @NonNull
  public final TextView nombreTitle11;

  @NonNull
  public final TextView nombreTitle6;

  @NonNull
  public final TextView nombreTitle7;

  @NonNull
  public final TextView nombreTitle8;

  @NonNull
  public final TextView nombreTitle9;

  @NonNull
  public final EditText numeroPorcionesEditText;

  @NonNull
  public final TextView numeroPorcionesTitle;

  @NonNull
  public final EditText porcionEditText;

  @NonNull
  public final TextView porcionTitle;

  @NonNull
  public final EditText proteinaEditText;

  @NonNull
  public final ConstraintLayout root1;

  @NonNull
  public final ScrollView scrollView2;

  @NonNull
  public final EditText sodioEditText;

  @NonNull
  public final TextView titleTextView;

  @NonNull
  public final ConstraintLayout topBarLayout;

  private ActivityDataEntryBinding(@NonNull ConstraintLayout rootView,
      @NonNull FloatingActionButton acceptButton, @NonNull EditText azucarEditText,
      @NonNull ImageButton backButton, @NonNull EditText caloriasEditText,
      @NonNull EditText carbsEditText, @NonNull EditText lipidosEditText,
      @NonNull EditText nombreEditText, @NonNull TextView nombreTitle,
      @NonNull TextView nombreTitle10, @NonNull TextView nombreTitle11,
      @NonNull TextView nombreTitle6, @NonNull TextView nombreTitle7,
      @NonNull TextView nombreTitle8, @NonNull TextView nombreTitle9,
      @NonNull EditText numeroPorcionesEditText, @NonNull TextView numeroPorcionesTitle,
      @NonNull EditText porcionEditText, @NonNull TextView porcionTitle,
      @NonNull EditText proteinaEditText, @NonNull ConstraintLayout root1,
      @NonNull ScrollView scrollView2, @NonNull EditText sodioEditText,
      @NonNull TextView titleTextView, @NonNull ConstraintLayout topBarLayout) {
    this.rootView = rootView;
    this.acceptButton = acceptButton;
    this.azucarEditText = azucarEditText;
    this.backButton = backButton;
    this.caloriasEditText = caloriasEditText;
    this.carbsEditText = carbsEditText;
    this.lipidosEditText = lipidosEditText;
    this.nombreEditText = nombreEditText;
    this.nombreTitle = nombreTitle;
    this.nombreTitle10 = nombreTitle10;
    this.nombreTitle11 = nombreTitle11;
    this.nombreTitle6 = nombreTitle6;
    this.nombreTitle7 = nombreTitle7;
    this.nombreTitle8 = nombreTitle8;
    this.nombreTitle9 = nombreTitle9;
    this.numeroPorcionesEditText = numeroPorcionesEditText;
    this.numeroPorcionesTitle = numeroPorcionesTitle;
    this.porcionEditText = porcionEditText;
    this.porcionTitle = porcionTitle;
    this.proteinaEditText = proteinaEditText;
    this.root1 = root1;
    this.scrollView2 = scrollView2;
    this.sodioEditText = sodioEditText;
    this.titleTextView = titleTextView;
    this.topBarLayout = topBarLayout;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityDataEntryBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityDataEntryBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_data_entry, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityDataEntryBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.acceptButton;
      FloatingActionButton acceptButton = rootView.findViewById(id);
      if (acceptButton == null) {
        break missingId;
      }

      id = R.id.azucarEditText;
      EditText azucarEditText = rootView.findViewById(id);
      if (azucarEditText == null) {
        break missingId;
      }

      id = R.id.backButton;
      ImageButton backButton = rootView.findViewById(id);
      if (backButton == null) {
        break missingId;
      }

      id = R.id.caloriasEditText;
      EditText caloriasEditText = rootView.findViewById(id);
      if (caloriasEditText == null) {
        break missingId;
      }

      id = R.id.carbsEditText;
      EditText carbsEditText = rootView.findViewById(id);
      if (carbsEditText == null) {
        break missingId;
      }

      id = R.id.lipidosEditText;
      EditText lipidosEditText = rootView.findViewById(id);
      if (lipidosEditText == null) {
        break missingId;
      }

      id = R.id.nombreEditText;
      EditText nombreEditText = rootView.findViewById(id);
      if (nombreEditText == null) {
        break missingId;
      }

      id = R.id.nombreTitle;
      TextView nombreTitle = rootView.findViewById(id);
      if (nombreTitle == null) {
        break missingId;
      }

      id = R.id.nombreTitle10;
      TextView nombreTitle10 = rootView.findViewById(id);
      if (nombreTitle10 == null) {
        break missingId;
      }

      id = R.id.nombreTitle11;
      TextView nombreTitle11 = rootView.findViewById(id);
      if (nombreTitle11 == null) {
        break missingId;
      }

      id = R.id.nombreTitle6;
      TextView nombreTitle6 = rootView.findViewById(id);
      if (nombreTitle6 == null) {
        break missingId;
      }

      id = R.id.nombreTitle7;
      TextView nombreTitle7 = rootView.findViewById(id);
      if (nombreTitle7 == null) {
        break missingId;
      }

      id = R.id.nombreTitle8;
      TextView nombreTitle8 = rootView.findViewById(id);
      if (nombreTitle8 == null) {
        break missingId;
      }

      id = R.id.nombreTitle9;
      TextView nombreTitle9 = rootView.findViewById(id);
      if (nombreTitle9 == null) {
        break missingId;
      }

      id = R.id.numeroPorcionesEditText;
      EditText numeroPorcionesEditText = rootView.findViewById(id);
      if (numeroPorcionesEditText == null) {
        break missingId;
      }

      id = R.id.numeroPorcionesTitle;
      TextView numeroPorcionesTitle = rootView.findViewById(id);
      if (numeroPorcionesTitle == null) {
        break missingId;
      }

      id = R.id.porcionEditText;
      EditText porcionEditText = rootView.findViewById(id);
      if (porcionEditText == null) {
        break missingId;
      }

      id = R.id.porcionTitle;
      TextView porcionTitle = rootView.findViewById(id);
      if (porcionTitle == null) {
        break missingId;
      }

      id = R.id.proteinaEditText;
      EditText proteinaEditText = rootView.findViewById(id);
      if (proteinaEditText == null) {
        break missingId;
      }

      ConstraintLayout root1 = (ConstraintLayout) rootView;

      id = R.id.scrollView2;
      ScrollView scrollView2 = rootView.findViewById(id);
      if (scrollView2 == null) {
        break missingId;
      }

      id = R.id.sodioEditText;
      EditText sodioEditText = rootView.findViewById(id);
      if (sodioEditText == null) {
        break missingId;
      }

      id = R.id.titleTextView;
      TextView titleTextView = rootView.findViewById(id);
      if (titleTextView == null) {
        break missingId;
      }

      id = R.id.topBarLayout;
      ConstraintLayout topBarLayout = rootView.findViewById(id);
      if (topBarLayout == null) {
        break missingId;
      }

      return new ActivityDataEntryBinding((ConstraintLayout) rootView, acceptButton, azucarEditText,
          backButton, caloriasEditText, carbsEditText, lipidosEditText, nombreEditText, nombreTitle,
          nombreTitle10, nombreTitle11, nombreTitle6, nombreTitle7, nombreTitle8, nombreTitle9,
          numeroPorcionesEditText, numeroPorcionesTitle, porcionEditText, porcionTitle,
          proteinaEditText, root1, scrollView2, sodioEditText, titleTextView, topBarLayout);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
