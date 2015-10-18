package ru.spbau.mit.starlab.financialassistant;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class ExpensesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_expenses);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_expenses, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void onBtnExpense1Click(View view) {
        Intent intent = new Intent(ExpensesActivity.this, AddExpenseActivity.class);
        intent.putExtra("name", "first");
        startActivity(intent);
    }
    public void onBtnExpense2Click(View view) {
        Intent intent = new Intent(ExpensesActivity.this, AddExpenseActivity.class);
        intent.putExtra("name", "second");
        startActivity(intent);
    }
    public void onBtnExpense3Click(View view) {
        Intent intent = new Intent(ExpensesActivity.this, AddExpenseActivity.class);
        intent.putExtra("name", "third");
        startActivity(intent);
    }
    public void onBtnExpenseOtherClick(View view) {
        Intent intent = new Intent(ExpensesActivity.this, AddExpenseActivity.class);
        intent.putExtra("name", "other");
        startActivity(intent);
    }
}
