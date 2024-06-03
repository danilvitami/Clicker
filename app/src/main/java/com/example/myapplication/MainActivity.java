

public class MainActivity extends AppCompatActivity {

    private int counter = 0;
    private TextView counterTextView;
    private Button clickButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Находим TextView и Button по их ID
        TextView counterTextView = findViewById(R.id.counterTextView);

        clickButton = findViewById(R.id.clickButton);





