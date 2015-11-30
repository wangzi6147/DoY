package com.namitor.wangzi6147.doy.view.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.namitor.wangzi6147.doy.R;

/**
 * Created by wangzi6147 on 2015/11/29.
 */
public class TopBar extends RelativeLayout {

    private TextView mTextLeft, mTextCenter, mTextRight;
    private ImageView mImageLeft, mImageRight;
    private OnTopBarClickListener mOnTopBarClickListerner;

    public TopBar(Context context) {
        super(context);
        init();
    }

    public TopBar(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public TopBar(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        Context context = getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        inflater.inflate(R.layout.view_topbar, this);

        mImageLeft = (ImageView) findViewById(R.id.iv_view_topbar_left);
        mTextLeft = (TextView) findViewById(R.id.tv_view_topbar_left);
        mTextCenter = (TextView) findViewById(R.id.tv_view_topbar_center);
        mTextRight = (TextView) findViewById(R.id.tv_view_topbar_right);

        mImageLeft.setOnClickListener(onClickListener);
        mTextLeft.setOnClickListener(onClickListener);
        mTextCenter.setOnClickListener(onClickListener);
        mTextRight.setOnClickListener(onClickListener);
    }

    private OnClickListener onClickListener = new OnClickListener() {
        @Override
        public void onClick(View v) {
            if (mOnTopBarClickListerner != null) {
                switch (v.getId()) {
                    case R.id.iv_view_topbar_left:
                    case R.id.tv_view_topbar_left:
                        mOnTopBarClickListerner.onLeftClick();
                        break;
                    case R.id.tv_view_topbar_center:
                        mOnTopBarClickListerner.onCenterClick();
                        break;
                    case R.id.tv_view_topbar_right:
                        mOnTopBarClickListerner.onRightClick();
                        break;
                    default:
                        break;
                }
            }
        }
    };

    public void hide() {
        setVisibility(View.GONE);
    }

    public void setOnTopBarClickListener(OnTopBarClickListener listener) {
        this.mOnTopBarClickListerner = listener;
    }

    public interface OnTopBarClickListener {
        void onLeftClick();

        void onCenterClick();

        void onRightClick();
    }
}
