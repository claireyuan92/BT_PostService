package noti;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "*")
@RepositoryRestResource(collectionResourceRel = "post", path = "post")
public interface PostRepository extends MongoRepository<Post, String> {

    List<Post> findByCourseId(@Param("courseId") String courseId);

}
