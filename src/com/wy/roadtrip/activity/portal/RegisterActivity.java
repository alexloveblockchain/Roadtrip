package com.wy.roadtrip.activity.portal;

import android.view.View;

import com.froyo.commonjar.activity.BaseActivity;
import com.lidroid.xutils.view.annotation.event.OnClick;
import com.wy.roadtrip.R;
import com.wy.roadtrip.componet.TitleBar;
/**
 * 
 * @Des: 注册
 * @author Rhino 
 * @version V1.0 
 * @created  2015年5月7日 上午10:00:32
 */
public class RegisterActivity extends BaseActivity {

	@Override
	public void doBusiness() {
		TitleBar bar=new TitleBar(activity);
		bar.showBack();
		bar.setTitle("注册");
	}
	
	@OnClick(R.id.btn_submit)
	void submit(View view){
		skip(AddInfoActivity.class);
	}
	
	@Override
	protected int setLayoutResID() {
		return R.layout.activity_register;
	}

}