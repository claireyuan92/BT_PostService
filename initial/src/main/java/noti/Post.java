package noti;

import org.springframework.data.annotation.Id;

import java.net.URL;
import java.util.Date;
import java.util.List;

public class Post {
    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

//    {
//	“_id”: ObjectId(),
//	“courseId”: reference,
//“tags”: [],
//“subject”: string,
//“content”: string,
//“userId”: reference,
//“userName”: string,
//“publishedTime”: datetime,
//“updatedTime”: datetime,
//“replies”: [
//        {
//	“replyId”: ObjectId(),
//	“content”: string,
//	“userId”: reference,
//	“userName”: string,
//	“Timestamp”: datetime
//        }
//]
//    }


    class Reply {
        @Id private String replyId;
        private String content;
        private String userId;
        private String userName;
        private Date timestamp;

        public String getUserId() {
            return userId;
        }

        public void setUserId(String userId) {
            this.userId = userId;
        }

        public String getReplyId() {
            return replyId;
        }

        public void setReplyId(String replyId) {
            this.replyId = replyId;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public Date getTimestamp() {
            return timestamp;
        }

        public void setTimestamp(Date timestamp) {
            this.timestamp = timestamp;
        }
    }

    @Id private String id;

    private String courseId;
    private List<String> tags;
    private String subject;
    private String content;
    private String userId;
    private String userName;
    private Date publishedTime;
    private Date updatedTime;

    public String getCourseId() {
	return courseId;
    }

    public void setCourseId(String courseId) {
	this.courseId = courseId;
    }


    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }


    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getPublishedTime() {
        return publishedTime;
    }

    public void setPublishedTime(Date publishedTime) {
        this.publishedTime = publishedTime;
    }

    public Date getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }


}
