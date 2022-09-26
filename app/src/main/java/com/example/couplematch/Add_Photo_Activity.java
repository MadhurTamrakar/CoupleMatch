package com.example.couplematch;


import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.content.ContextCompat;
import android.Manifest;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.example.couplematch.UserInterface.UserService;
import com.example.couplematch.databinding.ActivityMainBinding;
import com.example.couplematch.response.PhotoResponse;
import com.example.couplematch.service.ApiService;
import com.example.couplematch.sharedPreference.SharedPrefManager;
import java.io.File;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Add_Photo_Activity extends AppCompatActivity {

    ActivityMainBinding binding;
    SharedPrefManager sharedPrefManager;
    TextView Btn_back;
    AppCompatButton Continue_btn;
    Dialog MyPopUp;
    ImageView image1, image2, image3, image4, image5, image6;
    String path, path2, path3, path4, path5, path6;
    private int PHOTO = 1;
    private int PHOTO2 = 2;
    private int PHOTO3 = 3;
    private int PHOTO4 = 4;
    private int PHOTO5 = 5;
    private int PHOTO6 = 6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        binding = ActivityMainBinding.inflate (getLayoutInflater ());
        setContentView (R.layout.activity_add_photo);

        sharedPrefManager = new SharedPrefManager (this);
        Continue_btn = findViewById (R.id.Continue_btn);
        Btn_back = findViewById (R.id.Btn_back);
        image1 = findViewById (R.id.image1);
        image2 = findViewById (R.id.image2);
        image3 = findViewById (R.id.image3);
        image4 = findViewById (R.id.image4);
        image5 = findViewById (R.id.image5);
        image6 = findViewById (R.id.image6);

        MyPopUp = new Dialog (this);

        Continue_btn.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                String user_id = sharedPrefManager.getId ();
                startActivity (new Intent (Add_Photo_Activity.this, Welcome_Splash_Activity.class));
                UploadImage (user_id);
            }
        });


        image1.setOnClickListener (new View.OnClickListener () {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View v) {
                if (!checkStorePermission ()) {
                    requestStorePermission ();
                } else {
                    Intent intent = new Intent (Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                    startActivityForResult (intent, PHOTO);
                }
            }
        });
        image2.setOnClickListener (new View.OnClickListener () {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View v) {
                if (!checkStorePermission ()) {
                    requestStorePermission ();
                } else {
                    Intent intent = new Intent (Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                    startActivityForResult (intent, PHOTO2);
                }
            }
        });
        image3.setOnClickListener (new View.OnClickListener () {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View v) {
                if (!checkStorePermission ()) {
                    requestStorePermission ();
                } else {
                    Intent intent = new Intent (Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                    startActivityForResult (intent, PHOTO3);
                }
            }
        });
        image4.setOnClickListener (new View.OnClickListener () {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View v) {
                if (!checkStorePermission ()) {
                    requestStorePermission ();
                } else {
                    Intent intent = new Intent (Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                    startActivityForResult (intent, PHOTO4);
                }
            }
        });
        image5.setOnClickListener (new View.OnClickListener () {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View v) {
                if (!checkStorePermission ()) {
                    requestStorePermission ();
                } else {
                    Intent intent = new Intent (Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                    startActivityForResult (intent, PHOTO5);
                }
            }
        });
        image6.setOnClickListener (new View.OnClickListener () {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View v) {
                if (!checkStorePermission ()) {
                    requestStorePermission ();
                } else {
                    Intent intent = new Intent (Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                    startActivityForResult (intent, PHOTO6);
                }
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult (requestCode, resultCode, data);

        if (requestCode == PHOTO && data != null) {
            Uri uri = data.getData ();
            Context context = Add_Photo_Activity.this;
            path = RealPathUtil.getRealPath (context, uri);
            Bitmap bitmap = BitmapFactory.decodeFile (path);
            image1.setImageBitmap (bitmap);


        }
        if (requestCode == PHOTO2 && data != null) {
            Uri uri = data.getData ();
            Context context = Add_Photo_Activity.this;
            path2 = RealPathUtil.getRealPath (context, uri);
            Bitmap bitmap = BitmapFactory.decodeFile (path2);
            image2.setImageBitmap (bitmap);
        }
        if (requestCode == PHOTO3 && data != null) {
            Uri uri = data.getData ();
            Context context = Add_Photo_Activity.this;
            path3 = RealPathUtil.getRealPath (context, uri);
            Bitmap bitmap = BitmapFactory.decodeFile (path3);
            image3.setImageBitmap (bitmap);
        }
        if (requestCode == PHOTO4 && data != null) {
            Uri uri = data.getData ();
            Context context = Add_Photo_Activity.this;
            path4 = RealPathUtil.getRealPath (context, uri);
            Bitmap bitmap = BitmapFactory.decodeFile (path4);
            image4.setImageBitmap (bitmap);
        }
        if (requestCode == PHOTO5 && data != null) {
            Uri uri = data.getData ();
            Context context = Add_Photo_Activity.this;
            path5 = RealPathUtil.getRealPath (context, uri);
            Bitmap bitmap = BitmapFactory.decodeFile (path5);
            image5.setImageBitmap (bitmap);
        }
        if (requestCode == PHOTO6 && data != null) {
            Uri uri = data.getData ();
            Context context = Add_Photo_Activity.this;
            path6 = RealPathUtil.getRealPath (context, uri);
            Bitmap bitmap = BitmapFactory.decodeFile (path6);
            image6.setImageBitmap (bitmap);
        }
    }

    public void UploadImage(String User_id) {
        File file = new File (path);
        File file2 = new File (path2);
        File file3 = new File (path3);
        File file4 = new File (path4);
        File file5 = new File (path5);
        File file6 = new File (path6);

        RequestBody requestFile = RequestBody.create (MediaType.parse ("multipart/form-data"), file);
        MultipartBody.Part body = MultipartBody.Part.createFormData ("profile1", file.getName (), requestFile);

        RequestBody requestFile2 = RequestBody.create (MediaType.parse ("multipart/form-data"), file2);
        MultipartBody.Part body2 = MultipartBody.Part.createFormData ("profile2", file2.getName (), requestFile2);

        RequestBody requestFile3 = RequestBody.create (MediaType.parse ("multipart/form-data"), file3);
        MultipartBody.Part body3 = MultipartBody.Part.createFormData ("profile3", file3.getName (), requestFile3);

        RequestBody requestFile4 = RequestBody.create (MediaType.parse ("multipart/form-data"), file4);
        MultipartBody.Part body4 = MultipartBody.Part.createFormData ("profile4", file4.getName (), requestFile4);

        RequestBody requestFile5 = RequestBody.create (MediaType.parse ("multipart/form-data"), file5);
        MultipartBody.Part body5 = MultipartBody.Part.createFormData ("profile5", file5.getName (), requestFile5);

        RequestBody requestFile6 = RequestBody.create (MediaType.parse ("multipart/form-data"), file6);
        MultipartBody.Part body6 = MultipartBody.Part.createFormData ("profile6", file6.getName (), requestFile6);

        RequestBody user = RequestBody.create (MediaType.parse ("multipart/form-data"), User_id);
        UserService apiService = ApiService.getService ();
        Call<PhotoResponse> call = apiService.UploadImage (user, body, body2, body3, body4, body5, body6);
        call.enqueue (new Callback<PhotoResponse> () {
            @Override
            public void onResponse(Call<PhotoResponse> call, Response<PhotoResponse> response) {
                if (response.isSuccessful ()) {

                    if (response.body ().getResult ().toString ().equals ("200")) {

                    } else {}
                }
            }

            @Override
            public void onFailure(Call<PhotoResponse> call, Throwable t) {
                Toast.makeText (getApplicationContext (), t.toString (), Toast.LENGTH_SHORT).show ();
            }
        });
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    private void requestStorePermission() {
        requestPermissions (new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE}, 100);
    }

    private boolean checkStorePermission() {
        boolean res2 = ContextCompat.checkSelfPermission (this, Manifest.permission.WRITE_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED;
        return res2;
    }

    public void CouplePopUp(View v) {
        TextView textClose;
        MyPopUp.setContentView (R.layout.welcome_popup);
        textClose = (TextView) MyPopUp.findViewById (R.id.textClose);

        textClose.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                MyPopUp.dismiss ();
                startActivity (new Intent (Add_Photo_Activity.this, Welcome_Splash_Activity.class));
            }
        });
        MyPopUp.getWindow ().setBackgroundDrawable (new ColorDrawable (Color.TRANSPARENT));
        MyPopUp.show ();
    }
}
