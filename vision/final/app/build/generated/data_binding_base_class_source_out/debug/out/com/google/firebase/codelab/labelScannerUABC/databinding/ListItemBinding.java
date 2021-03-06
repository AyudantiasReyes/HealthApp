// Generated by view binder compiler. Do not edit!
package com.google.firebase.codelab.labelScannerUABC.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import com.google.firebase.codelab.labelScannerUABC.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ListItemBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final CardView cv;

  @NonNull
  public final TextView dateAdded;

  @NonNull
  public final ImageButton deleteButton;

  @NonNull
  public final TextView nameTextView;

  @NonNull
  public final TextView sizeTextView;

  private ListItemBinding(@NonNull LinearLayout rootView, @NonNull CardView cv,
      @NonNull TextView dateAdded, @NonNull ImageButton deleteButton,
      @NonNull TextView nameTextView, @NonNull TextView sizeTextView) {
    this.rootView = rootView;
    this.cv = cv;
    this.dateAdded = dateAdded;
    this.deleteButton = deleteButton;
    this.nameTextView = nameTextView;
    this.sizeTextView = sizeTextView;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ListItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ListItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.list_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ListItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.cv;
      CardView cv = rootView.findViewById(id);
      if (cv == null) {
        break missingId;
      }

      id = R.id.dateAdded;
      TextView dateAdded = rootView.findViewById(id);
      if (dateAdded == null) {
        break missingId;
      }

      id = R.id.deleteButton;
      ImageButton deleteButton = rootView.findViewById(id);
      if (deleteButton == null) {
        break missingId;
      }

      id = R.id.nameTextView;
      TextView nameTextView = rootView.findViewById(id);
      if (nameTextView == null) {
        break missingId;
      }

      id = R.id.sizeTextView;
      TextView sizeTextView = rootView.findViewById(id);
      if (sizeTextView == null) {
        break missingId;
      }

      return new ListItemBinding((LinearLayout) rootView, cv, dateAdded, deleteButton, nameTextView,
          sizeTextView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
