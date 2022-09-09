import './Footer.css';
import Box from '@mui/material/Box';
import Typography from '@mui/material/Typography';
import Container from '@mui/material/Container';

export default function Footer() {
  return (
    <div className="Footer">
      <Box
        component="footer"
        sx={{
          py: 1,
          px: 2,
          mt: 'auto',
          backgroundColor: 'primary.main'
        }}>
        <Container maxWidth="md">
          <Typography align="center" variant="body1" color="white">
            Made by Sebastian Abril
          </Typography>
          <Typography variant="body2" color="white" align="center">
            {'Copyright © '}

            {new Date().getFullYear()}
            {'.'}
          </Typography>
        </Container>
      </Box>
    </div>
  );
}
