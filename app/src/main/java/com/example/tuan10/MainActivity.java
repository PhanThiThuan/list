package com.example.tuan10;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    RecyclerView mRecyclerView;
    List<FoodData> myFoodList;
    FoodData mFoodData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = (RecyclerView)findViewById(R.id.recyclerView);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(MainActivity.this,1);
        mRecyclerView.setLayoutManager(gridLayoutManager);

        myFoodList = new ArrayList<>();

        mFoodData = new FoodData("Bún Khô","Bún khô có vị gạo thơm rất đặc trưng, sợi bún tròn mượt vừa dẻo, vừa dai, không bị nát. Đây có thể coi là ưu điểm nổi trội của bún khô Mikiri so với bún tươi và các loại bún khô khác trên thị trường","69.000đ",R.drawable.bunkho);
        myFoodList.add(mFoodData);
        mFoodData = new FoodData("Bánh Gối","Phải nói thực là những món đồ chiên rán bao giờ cũng có một sức hấp dẫn mãnh liệt vô cùng, dù biết ăn nhiều thì ngấy, ăn nhiều thì không tốt lắm. Nhưng biết sao được khi giờ xế chiều nghĩ đến đám bánh gối, bánh rán, bánh tôm, bánh bao chiên vàng rụm ú ụ","49.000đ",R.drawable.banhgoi);
        myFoodList.add(mFoodData);
        mFoodData = new FoodData("Bún Đậu Mắm Tôm","Nhắc đến Bún đậu mắm tôm, du khách sẽ thấy trong mọi ngõ ngách của Hà Nôi, bún đậu mắm tôm trở thành món ăn vỉa hè dân dã thu hút du khách trong nước và quốc tế. Cũng vì thế mà món ăn này trở nên hấp dẫn và là gợi ý đầu tiên trong danh sách những món ăn ngon nên thử ở Hà Nội.","69.000đ",R.drawable.bundau);
        myFoodList.add(mFoodData);
        mFoodData = new FoodData("Cá  Kho Tộ","Mỗi vùng miền đều có những món ăn đặc trưng, đặc sản mang nét độc đáo, phong vị riêng theo khí hậu và địa lý thổ nhưỡng. Ngoài ra, tùy theo tính cách, lối sinh hoạt của con người từng vùng, từng miền mà ẩm thực cũng có sự khác nhau trong cách chế biến và thưởng thứ","59.000đ",R.drawable.cakho);
        myFoodList.add(mFoodData);

        MyAdapter myAdapter = new MyAdapter(MainActivity.this,myFoodList);
        mRecyclerView.setAdapter(myAdapter);

    }

}