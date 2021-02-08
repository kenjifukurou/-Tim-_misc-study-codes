package marsaint.arshiva;

public class Button {

    //when button clicked, pass title to tell what button is clicked
    private String title;
    private OnClickListener onClickListener;

    public Button(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public OnClickListener getOnClickListener() {
        return onClickListener;
    }

    public void setOnClickListener(OnClickListener onClickListener) {
        this.onClickListener = onClickListener;
    }

    public void clickButton() {
        if (this.onClickListener != null) {
            this.onClickListener.onClick(this.title);
            System.out.println("button clicked");
        } else {
            System.out.println("onClickListener is null");
        }
    }

    public interface OnClickListener {
        public void onClick(String title);
    }

}
