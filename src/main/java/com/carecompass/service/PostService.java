package com.carecompass.service;

import com.carecompass.models.Comments;
import com.carecompass.models.User;
import com.carecompass.payloads.PageResponse;
import com.carecompass.payloads.PageableDto;
import com.carecompass.payloads.PostDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;

public interface PostService {
    ResponseEntity<?> createPost(Integer categoryID, User user, PostDto postDto, MultipartFile[] images);

    ResponseEntity<?> updatePost(Long postId, User user, PostDto postDto);

    ResponseEntity<?> updatePostImage(Long postId, User user, MultipartFile[] images);

    ResponseEntity<?> deletePost(Long postId, User user);

    PageResponse getAllPost(User user, PageableDto pageable);

    ResponseEntity<?> getPostByID(User user, Long postId);

    // --------------------------------------------------- Comment ---------------------------------------------------------------------------
    ResponseEntity<?> addAComment(User user, Long postID, Comments comments);

    PageResponse getAllComments(User user, Long postId, PageableDto pageable);

    ResponseEntity<?> deleteComment(User user, Long commentId);
}
