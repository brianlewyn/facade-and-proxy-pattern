public interface ICourse {
    public int getIdCourse();
    public String getTitle();
    public String getLevel();
    public String getLanguage();
    public String getDescription();
    public String getPrerequisites();
    public String getCertificate();
    public String getContent();
    public String getVideo();

    public void setIdCourse(int idCourse);
    public void setTitle(String title);
    public void setLevel(String level);
    public void setLanguage(String language);
    public void setDescription(String description);
    public void setPrerequisites(String prerequisites);
    public void setCertificate(String certificate);
    public void setContent(String content);
    public void setVideo(String video);
    
    public void showCourseSummary();
    public void showCourseDetails();

    public void downloadContent();
    public void downloadVideo();
    public void downloadCertificate();
}
