public class Course implements ICourse {
    private int idCourse;
    private String title;
    private String level;
    private String language;
    private String description;
    private String prerequisites;
    private String certificate;
    private String content;
    private String video;

    public Course() {
        idCourse = 0;
        title = "";
        level = "";
        language = "";
        description = "";
        prerequisites = "";
        certificate = "";
        content = "";
    }

    public int getIdCourse() {
        return idCourse;
    }

    public String getTitle() {
        return title;
    }

    public String getLevel() {
        return level;
    }

    public String getLanguage() {
        return language;
    }

    public String getDescription() {
        return description;
    }

    public String getPrerequisites() {
        return prerequisites;
    }

    public String getCertificate() {
        return certificate;
    }

    public String getContent() {
        return content;
    }

    public String getVideo() {
        return video;
    }

    public void setIdCourse(int idCourse) {
        this.idCourse = idCourse;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrerequisites(String prerequisites) {
        this.prerequisites = prerequisites;
    }

    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public void showCourseSummary() {
        System.out.println("Course title: " + title);
        System.out.println("Course level: " + level);
        System.out.println("Course language: " + language);
        System.out.println("Course description: " + description + "\n");
    }

    public void showCourseDetails() {
        System.out.println("Course title: " + title);
        System.out.println("Course level: " + level);
        System.out.println("Course language: " + language);
        System.out.println("Course description: " + description);
        System.out.println("Course prerequisites: " + prerequisites);
        System.out.println("Course certificate: " + certificate);
        System.out.println("Course content: " + content);
        System.out.println("Course video: " + video+"\n");
    }

    public void downloadContent() {
        System.out.println("Downloading content...");
        System.out.println("Content: " + content);
        System.out.println("Content downloaded successfully!\n");
    }

    public void downloadVideo() {
        System.out.println("Downloading videos ...");
        System.out.println("Downloaded video: " + video);
        System.out.println("All videos downloaded successfully!\n");
    }

    public void downloadCertificate() {
        System.out.println("Downloading certificate...");
        System.out.println("Certificate: " + certificate);
        System.out.println("Certificate downloaded successfully!\n");
    }
}