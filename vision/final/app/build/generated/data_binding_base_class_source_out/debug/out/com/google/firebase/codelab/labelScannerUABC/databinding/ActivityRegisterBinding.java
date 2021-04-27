// Generated by view binder compiler. Do not edit!
package com.google.firebase.codelab.labelScannerUABC.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.google.firebase.codelab.labelScannerUABC.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityRegisterBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button buttonSiguiente;

  @NonNull
  public final EditText editTextTextEmailAddress;

  @NonNull
  public final EditText editTextTextPassword;

  @NonNull
  public final EditText editTextTextPersonName;

  @NonNull
  public final EditText editTextTextPersonName2;

  @NonNull
  public final ConstraintLayout registerContainer;

  @NonNull
  public final TextView textGenero;

  @NonNull
  public final TextView textRegistro;

  @NonNull
  public final TextView textView5;

  @NonNull
  public final TextView textView6;

  @NonNull
  public final TextView textView8;

  private ActivityRegisterBinding(@NonNull ConstraintLayout rootView,
      @NonNull Button buttonSiguiente, @NonNull EditText editTextTextEmailAddress,
      @NonNull EditText editTextTextPassword, @NonNull EditText editTextTextPersonName,
      @NonNull EditText editTextTextPersonName2, @NonNull ConstraintLayout registerContainer,
      @NonNull TextView textGenero, @NonNull TextView textRegistro, @NonNull TextView textView5,
      @NonNull TextView textView6, @NonNull TextView textView8) {
    this.rootView = rootView;
    this.buttonSiguiente = buttonSiguiente;
    this.editTextTextEmailAddress = editTextTextEmailAddress;
    this.editTextTextPassword = editTextTextPassword;
    this.editTextTextPersonName = editTextTextPersonName;
    this.editTextTextPersonName2 = editTextTextPersonName2;
    this.registerContainer = registerContainer;
    this.textGenero = textGenero;
    this.textRegistro = textRegistro;
    this.textView5 = textView5;
    this.textView6 = textView6;
    this.textView8 = textView8;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityRegisterBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityRegisterBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_register, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityRegisterBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.button_siguiente;
      Button buttonSiguiente = rootView.findViewById(id);
      if (buttonSiguiente == null) {
        break missingId;
      }

      id = R.id.editTextTextEmailAddress;
      EditText editTextTextEmailAddress = rootView.findViewById(id);
      if (editTextTextEmailAddress == null) {
        break missingId;
      }

      id = R.id.editTextTextPassword;
      EditText editTextTextPassword = rootView.findViewById(id);
      if (editTextTextPassword == null) {
        break missingId;
      }

      id = R.id.editTextTextPersonName;
      EditText editTextTextPersonName = rootView.findViewById(id);
      if (editTextTextPersonName == null) {
        break missingId;
      }

      id = R.id.editTextTextPersonName2;
      EditText editTextTextPersonName2 = rootView.findViewById(id);
      if (editTextTextPersonName2 == null) {
        break missingId;
      }

      id = R.id.register_container;
      ConstraintLayout registerContainer = rootView.findViewById(id);
      if (registerContainer == null) {
        break missingId;
      }

      id = R.id.text_genero;
      TextView textGenero = rootView.findViewById(id);
      if (textGenero == null) {
        break missingId;
      }

      id = R.id.text_registro;
      TextView textRegistro = rootView.findViewById(id);
      if (textRegistro == null) {
        break missingId;
      }

      id = R.id.textView5;
      TextView textView5 = rootView.findViewById(id);
      if (textView5 == null) {
        break missingId;
      }

      id = R.id.textView6;
      TextView textView6 = rootView.findViewById(id);
      if (textView6 == null) {
        break missingId;
      }

      id = R.id.textView8;
      TextView textView8 = rootView.findViewById(id);
      if (textView8 == null) {
        break missingId;
      }

      return new ActivityRegisterBinding((ConstraintLayout) rootView, buttonSiguiente,
          editTextTextEmailAddress, editTextTextPassword, editTextTextPersonName,
          editTextTextPersonName2, registerContainer, textGenero, textRegistro, textView5,
          textView6, textView8);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
