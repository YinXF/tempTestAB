package com.example.temptestab;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.EntityUtils;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.telephony.TelephonyManager;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.*;




public class MainActivity extends Activity {

	
	// UI controls
	private EditText editUsername;
	private EditText editPassword;
	private CheckBox checkRemember;
	private ImageButton btn_Login;
	private TextView txtview;
	private Handler handler = null;
	private String username;
    private String password;
	
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        
        
        
        TextView hyperlinkTextView = (TextView)findViewById(R.id.txtHint);        
        btn_Login=(ImageButton)findViewById(R.id.login);
        checkRemember=(CheckBox)findViewById(R.id.checkbox);
        editUsername = (EditText) findViewById(R.id.editAccount);
        editPassword = (EditText) findViewById(R.id.editPsw);
        txtview=(TextView)findViewById(R.id.mTextView);
        
        btn_Login.setImageDrawable(getResources().getDrawable(R.drawable.signin));  
        btn_Login.setOnClickListener(myOnClickListener); 
        
      
        
        SpannableString msp=new SpannableString("Create an account?");   
        msp.setSpan(new URLSpan("http://www.baidu.com"), 0, 18, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);     //网络     
        hyperlinkTextView.setText(msp);  
       hyperlinkTextView.setMovementMethod(LinkMovementMethod.getInstance());  
       
    }

   private OnClickListener myOnClickListener = new OnClickListener() {  
       @Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
    	   //Toast.makeText(MainActivity.this, "1234", Toast.LENGTH_LONG).show();
    	  
    	    username = editUsername.getText().toString().trim();
    	    password = editPassword.getText().toString().trim();
    	    Map<String, String> params = new HashMap<String, String>();
    	     params.put("username", username);
    	 params.put("password", password);
    	 txtview.setText(HttpUtils.submitPostData(params, "utf-8"));
		}

		       
    }; 
    
    
/*    private class LoginHandler implements Runnable {
		public void run() {
			final TelephonyManager tm = (TelephonyManager) getBaseContext().getSystemService(Context.TELEPHONY_SERVICE); 
			final String tmDevice = tm.getDeviceId(); //imei号
			
			// 显示内容数据
			username = editUsername.getText().toString().trim();
			password = editPassword.getText().toString().trim();
			new PrivateAsyncGetData()
					.execute(new String[] { Contants.BASE_URL
							+ Contants.URL_LOGINMOBILE
							+ username
							+ "&password="
							+ MD5Util.getMD5String(password)
							+ "&serialnumber="
							+ tmDevice });
		}
	}
    
 // 下面这个处理不通用，需要找一个通用的方法来替代，主要就是把result的内容返回出来。
 	// TODO 这是一个待优化的地方。陈明磊

 	private class PrivateAsyncGetData extends AsyncTask<String, Void, String> {
 		@Override
		protected String doInBackground(String... urls) {
			String response = "";
			for (String url : urls) {
				DefaultHttpClient client = new DefaultHttpClient();
				HttpGet httpGet = new HttpGet(url);
				try {
					HttpResponse execute = client.execute(httpGet);
					InputStream content = execute.getEntity().getContent();

					BufferedReader buffer = new BufferedReader(
							new InputStreamReader(content));
					String s = "";
					while ((s = buffer.readLine()) != null) {
						response += s;
					}

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			return response;
		}

		@Override
		protected void onPostExecute(String result) {
			try {
				LoginResultObject jsonObject = JSON.parseObject(result,
						LoginResultObject.class);

				if (jsonObject.getSuccess() == 1) {
					String uid = "";
					String uname = "";
					String serialnumber = "";
					List<LoginResultDataObject> loginResultData = jsonObject
							.getData();
					for (LoginResultDataObject lrdObj : loginResultData) {
						uid = String.valueOf(lrdObj.getUID());
						uname = lrdObj.getUname();
						serialnumber = lrdObj.getSerialnumber();
					}
					try {
						// 保存用于下次访问用户信息
						fileService.save("loginInfo", uid + "_" + uname);
						fileService.save("loginUser", userName);
						fileService.save("serialnumber", serialnumber);
						Contants.isLogin = true;
						new PrivateInfoAsyncGetData()
								.execute(new String[] { Contants.BASE_URL
										+ Contants.URL_USERINFO + uid });
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				} else {
					Toast.makeText(MainActivity.this, "用户名或密码错误，登录失败。",
							Toast.LENGTH_SHORT).show();
				}
			} catch (Exception e) {
				Toast.makeText(MainActivity.this, "网络异常，登录失败。",
						Toast.LENGTH_SHORT).show();
			}
		}
 	}*/

    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
   
     
}



    

	
