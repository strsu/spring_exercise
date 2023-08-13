package hello.hellospring.repository;

import hello.hellospring.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SpringDataJpaMemberRepository extends JpaRepository<Member, Long>, MemberRepository {

    // name 같은 공통적인 필드가 아닌 것은 직접 정의해줘야 한다.
    @Override
    Optional<Member> findByName(String name);
}
