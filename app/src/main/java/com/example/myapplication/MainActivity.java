

public class MainActivity extends AppCompatActivity {

    private int counter = 0;
    private TextView counterTextView;
    private Button clickButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView counterTextView = findViewById(R.id.counterTextView);

        clickButton = findViewById(R.id.clickButton);


        clickButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // При клике увеличиваем счетчик и обновляем текст в TextView
                counter++;
                counterTextView.setText(String.valueOf(counter));


            }
        });
    }
}
