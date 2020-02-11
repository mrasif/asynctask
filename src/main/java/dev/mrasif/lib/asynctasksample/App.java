package dev.mrasif.lib.asynctasksample;

import dev.mrasif.lib.asynctask.AsyncTask;

public class App {
    public static void main(String[] args) {
        new AsyncTask<Void,Void,Void>(){
            @Override
            public void onPreExecute(Void... voids) {
                System.out.println("Pre execute");
            }

            @Override
            public Void doInBackground(Void... voids) {
                System.out.println("Background Task");
                return null;
            }

            @Override
            public void onPostExecute(Void aVoid) {
                System.out.println("Post Execute");
            }
        }.execute();
        System.out.println("Started.");
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        finally {
            System.exit(0);
        }
    }
}
