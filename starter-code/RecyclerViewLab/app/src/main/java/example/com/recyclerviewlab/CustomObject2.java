package example.com.recyclerviewlab;

/**
 * Created by owlslubic on 7/5/16.
 */
public class CustomObject2 {

    String mTitle, mDescription, mColor;
    boolean mCheck;

    public CustomObject2(String title, String description, String color) {
        //he has it as this.mTitle = title..?
        mTitle = title;
        mDescription = description;
        mColor = color;
        mCheck = false;
    }

    public String getmTitle() {
        return mTitle;
    }

    public String getmDescription() {
        return mDescription;
    }

    public String getmColor() {
        return mColor;
    }

    public boolean ismCheck() {
        return mCheck;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public void setmDescription(String mDescription) {
        this.mDescription = mDescription;
    }

    public void setmColor(String mColor) {
        this.mColor = mColor;
    }

    public void setmCheck(boolean mCheck) {
        this.mCheck = mCheck;
    }
}
