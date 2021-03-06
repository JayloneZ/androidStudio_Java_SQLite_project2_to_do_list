package com.example.user.tasklist.views;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ListView;

import com.example.user.tasklist.database.TaskRepo;
import com.example.user.tasklist.models.Task;
import com.example.user.tasklist.R;
import com.example.user.tasklist.adapters.TaskListAdapter;

import java.util.ArrayList;

public class PrioritiesActivity extends LayoutActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Utils.onActivityCreateSetTheme(this);
        setContentView(R.layout.activity_priorities);

        TaskRepo sQLiteHelper = new TaskRepo(this);

        ArrayList<Task> tasks = sQLiteHelper.getAllPriorityTasks();

        TaskListAdapter taskAdapter = new TaskListAdapter(this, tasks);

        ListView listView = findViewById(R.id.task_list_starred);

        listView.setAdapter(taskAdapter);
    }


    public void getTask(View listItemSelected) {

        Task selectedTask = (Task) listItemSelected.getTag();

        Intent intent = new Intent(this, ViewTaskActivity.class);

        intent.putExtra("ID", selectedTask.getId());

        startActivity(intent);

    }

    public void onAddButtonClicked(View addButtonClicked) {
        Intent intent = new Intent(this, AddTaskActivity.class);
        startActivity(intent);
    }

    public int checkedToInt(CheckBox checkBox) {
        if (checkBox.isChecked()) {
            return 1;
        } else {
            return 0;
        }
    }


    public void onCompletedClicked(View checkBoxSelected) {

        Task task = (Task) checkBoxSelected.getTag();
        CheckBox checkBox = (CheckBox) checkBoxSelected;


        int bool = checkedToInt(checkBox);


        TaskRepo sQLiteHelper = new TaskRepo(this);

        sQLiteHelper.setTaskBoolean(task, "TASK_COMPLETED", bool);

    }



    public void onDeleteTask(View deleteButton) {


        TaskRepo sQLiteHelper = new TaskRepo(this);

        Task task = (Task) deleteButton.getTag();

        sQLiteHelper.deleteTask(task);

        Intent intent = new Intent(this, MainActivity.class);

        startActivity(intent);

    }

}
