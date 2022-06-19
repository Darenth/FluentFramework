package pluralsight.pages.course;

import pluralsight.pages.BasePage;

public class CoursePage extends BasePage {
    private CourseActController act;
    private CourseVerifyController verify;

    public CourseActController act() {
        return act;
    }

    public CourseVerifyController verify() {
        return verify;
    }

    private CoursePage(CourseActController act, CourseVerifyController verify) {
        this.act = act;
        this.verify = verify;

    }

    public static CoursePage getCoursePage() {

        return new CoursePage(new CourseActController(), new CourseVerifyController());
    }


}
