package com.ssitcloud.app_operator.biz.impl;

import android.content.Context;
import android.content.res.Resources;
import android.util.Log;

import com.ssitcloud.app_operator.R;
import com.ssitcloud.app_operator.biz.UpdateOperatorInfoBizI;
import com.ssitcloud.app_operator.common.entity.HttpResponce;
import com.ssitcloud.app_operator.common.entity.ResultEntity;
import com.ssitcloud.app_operator.common.utils.HttpClientUtil;
import com.ssitcloud.app_operator.common.utils.JsonUtils;
import com.ssitcloud.app_operator.common.utils.RequestUrlUtil;

import java.net.SocketException;
import java.util.HashMap;
import java.util.Map;

/**
 * 创建日期：2017/3/23 18:25
 * @author shuangjunjie
 */

public class UpdateOperatorInfoBizImpl implements UpdateOperatorInfoBizI{

    private final String TAG = ""+getClass();
    private final String charset = "utf-8";
    private Context context;
    private Resources resources;

    public UpdateOperatorInfoBizImpl(Context context, Resources resources) {
        this.context = context.getApplicationContext();
        this.resources = resources;
    }

    @Override
    public ResultEntity updateOperatorInfo(Map<String, Object> reqMap) throws SocketException {

        String url = RequestUrlUtil.getUrl(resources, R.string.update_operator_info_url);
        Map<String, String> map = new HashMap<>();
        map.put("json", JsonUtils.toJson(reqMap));
        HttpResponce hr = HttpClientUtil.dopost(url, map, charset);
        if (hr.getState() == 200){
            try {
                ResultEntity result = JsonUtils.fromJson(hr.getBody(), ResultEntity.class);
                return result;
            }catch (Exception e){
                Log.e(TAG,"to json exception",e);
                return null;
            }
        }else {
            throw new SocketException("网络异常");
        }
    }
}