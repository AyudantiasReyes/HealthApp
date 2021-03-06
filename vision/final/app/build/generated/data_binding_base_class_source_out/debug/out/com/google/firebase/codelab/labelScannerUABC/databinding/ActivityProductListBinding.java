// Generated by view binder compiler. Do not edit!
package com.google.firebase.codelab.labelScannerUABC.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.google.firebase.codelab.labelScannerUABC.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityProductListBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ConstraintLayout buttonLayout;

  @NonNull
  public final ConstraintLayout constraintLayout;

  @NonNull
  public final RecyclerView myRecyclerView;

  @NonNull
  public final Spinner porcionSpinner;

  @NonNull
  public final FrameLayout roleSpinnerFrame;

  @NonNull
  public final ConstraintLayout root4;

  @NonNull
  public final TextView textView;

  private ActivityProductListBinding(@NonNull ConstraintLayout rootView,
      @NonNull ConstraintLayout buttonLayout, @NonNull ConstraintLayout constraintLayout,
      @NonNull RecyclerView myRecyclerView, @NonNull Spinner porcionSpinner,
      @NonNull FrameLayout roleSpinnerFrame, @NonNull ConstraintLayout root4,
      @NonNull TextView textView) {
    this.rootView = rootView;
    this.buttonLayout = buttonLayout;
    this.constraintLayout = constraintLayout;
    this.myRecyclerView = myRecyclerView;
    this.porcionSpinner = porcionSpinner;
    this.roleSpinnerFrame = roleSpinnerFrame;
    this.root4 = root4;
    this.textView = textView;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityProductListBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityProductListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_product_list, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityProductListBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.buttonLayout;
      ConstraintLayout buttonLayout = rootView.findViewById(id);
      if (buttonLayout == null) {
        break missingId;
      }

      id = R.id.constraintLayout;
      ConstraintLayout constraintLayout = rootView.findViewById(id);
      if (constraintLayout == null) {
        break missingId;
      }

      id = R.id.my_recycler_view;
      RecyclerView myRecyclerView = rootView.findViewById(id);
      if (myRecyclerView == null) {
        break missingId;
      }

      id = R.id.porcionSpinner;
      Spinner porcionSpinner = rootView.findViewById(id);
      if (porcionSpinner == null) {
        break missingId;
      }

      id = R.id.roleSpinnerFrame;
      FrameLayout roleSpinnerFrame = rootView.findViewById(id);
      if (roleSpinnerFrame == null) {
        break missingId;
      }

      ConstraintLayout root4 = (ConstraintLayout) rootView;

      id = R.id.textView;
      TextView textView = rootView.findViewById(id);
      if (textView == null) {
        break missingId;
      }

      return new ActivityProductListBinding((ConstraintLayout) rootView, buttonLayout,
          constraintLayout, myRecyclerView, porcionSpinner, roleSpinnerFrame, root4, textView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
