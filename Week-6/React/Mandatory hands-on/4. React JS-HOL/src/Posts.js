import React from 'react';

class Posts extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      posts: [],
      hasError: false
    };
  }

  componentDidMount() {
    fetch('https://jsonplaceholder.typicode.com/posts')
      .then(res => res.json())
      .then(data => this.setState({ posts: data }))
      .catch(err => {
        this.setState({ hasError: true });
        alert('Failed to load posts.');
      });
  }

  componentDidCatch(error, info) {
    this.setState({ hasError: true });
    alert('Something went wrong!');
  }

  render() {
    return (
      <>
        <h2>Blog Posts</h2>
        {this.state.posts.map(post => (
          <>
            <h3 key={`title-${post.id}`}>{post.title}</h3>
            <p key={`body-${post.id}`}>{post.body}</p>
          </>
        ))}
      </>
    );
  }
}

export default Posts;
