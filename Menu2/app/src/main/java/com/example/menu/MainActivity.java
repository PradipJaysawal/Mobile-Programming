package com.example.menu;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;  // Make sure you import Toolbar

public class MainActivity extends AppCompatActivity {

    private TextView textViewContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Set up Toolbar as ActionBar
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // Initialize Button and TextView
        Button buttonShowMenu = findViewById(R.id.button_show_menu);
        textViewContext = findViewById(R.id.textView_context);

        // Set Click Listener for Popup Menu
        buttonShowMenu.setOnClickListener(this::showPopupMenu);

        // Register Context Menu for TextView
        registerForContextMenu(textViewContext);
    }

    // === POPUP MENU ===
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

    // === CONTEXT MENU ===
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.context_menu, menu);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.context_copy) {
            Toast.makeText(this, "Copy clicked", Toast.LENGTH_SHORT).show();
            return true;
        } else if (item.getItemId() == R.id.context_share) {
            Toast.makeText(this, "Share clicked", Toast.LENGTH_SHORT).show();
            return true;
        }
        return super.onContextItemSelected(item);
    }

    // === OPTIONS MENU ===
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.options_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.option_settings) {
            Toast.makeText(this, "Settings clicked", Toast.LENGTH_SHORT).show();
            return true;
        } else if (item.getItemId() == R.id.option_logout) {
            Toast.makeText(this, "Logout clicked", Toast.LENGTH_SHORT).show();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
