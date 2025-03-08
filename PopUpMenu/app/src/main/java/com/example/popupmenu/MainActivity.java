package com.example.popupmenu;

import android.os.Bundle;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Button to trigger the popup menu
        Button buttonShowMenu = findViewById(R.id.button_show_menu);
        buttonShowMenu.setOnClickListener(this::showPopupMenu);
    }

    private void showPopupMenu(View view) {
        PopupMenu popup = new PopupMenu(this, view);
        MenuInflater inflater = popup.getMenuInflater();
        inflater.inflate(R.menu.popup_menu, popup.getMenu());

        popup.setOnMenuItemClickListener(item -> {
            handleMenuClick(item);
            return true;
        });

        popup.show();
    }

    private void handleMenuClick(MenuItem item) {
        if (item.getItemId() == R.id.action_edit) {
            Toast.makeText(this, "Edit clicked", Toast.LENGTH_SHORT).show();
        } else if (item.getItemId() == R.id.action_delete) {
            Toast.makeText(this, "Delete clicked", Toast.LENGTH_SHORT).show();
        }
    }
}
